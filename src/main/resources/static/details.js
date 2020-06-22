$(document).ready(function() {
  $('li.active').removeClass('active');
  $('a[href="' + location.pathname + '"]').closest('li').addClass('active');

    function tryEnableBookButton(){
    if($('#touristNameValid').is(':visible') && $('#startDateValid').is(':visible')) {
        $('#bookButton').prop('disabled', false);
    }
    }

  $('#modal-touristName').focusout(function() {
      tryEnableBookButton();
  })

  $('#modal-vacation-startDate').focusout(function() {
      tryEnableBookButton();
  })

      let editBookingId = null;

    $('#bookButton').click(() => {
        console.log($('#touristNameValid'))
        const touristName = $('#modal-touristName').val();
        const startDate = $('#modal-vacation-startDate').val();

        const body = {
            touristName: touristName,
            startDate: startDate
            }
        const vacationId = window.location.pathname.split("/")[2];
        fetch('/api/vacations/' + vacationId + '/bookings', {
            method: 'post',
            body: JSON.stringify(body),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(data=>{
        $('#successfulToast').toast('show');
                            setInterval(function(){ $('#successfulToast').toast('hide'); }, 3000);
        })

    $('#bookVacation').click(function () {
        resetForm();
        editBookingId = this.parentElement.id;
    });

    function resetForm() {
    $('#bookButton').prop('disabled', true);
    $('#modal-touristName').val('');
    $('#modal-vacation-startDate').val('');
    }
});
})