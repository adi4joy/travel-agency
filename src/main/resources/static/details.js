$(document).ready(function() {
  $('li.active').removeClass('active');
  $('a[href="' + location.pathname + '"]').closest('li').addClass('active');

      let editBookingId = null;

    $('#bookButton').click(() => {
        const touristName = $('#modal-touristName').val();
        const startDate = $('#modal-vacation-startDate').val();

        const body = {
            touristName: touristName,
            startDate: startDate
            }
            console.log(JSON.stringify(body))
            const vacationId = window.location.pathname.split("/")[2];
        fetch('/api/vacations/' + vacationId + '/bookings', {
            method: 'post',
            body: JSON.stringify(body),
            headers: {
                'Content-Type': 'application/json'
            }
        });

    $('#bookVacation').click(function () {
        editBookingId = this.parentElement.id;
        fetch('/api/bookings/' + editBookingId)
        .then(response => response.json())
        .then(vacation => {
            const touristName = $('#modal-tourist-name').val();
            const startDate = $('#modal-vacation-startDate').val();
            const name = $('#modal-vacation-name').val();
            const stars = $('#modal-vacation-stars').val();
            const location = $('#modal-vacation-location').val();
            const price = $('#modal-vacation-price').val();
            const duration = $('#modal-vacation-duration').val();
        });

    });
});
})