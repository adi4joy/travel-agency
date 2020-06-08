$(document).ready(function() {
  $('li.active').removeClass('active');
  $('a[href="' + location.pathname + '"]').closest('li').addClass('active');

  $("#search").on("keyup", function() {
          var value = $(this).val().toLowerCase();
          $("#bookingTable tr").filter(function() {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
          });
        });

  $('.fa-trash-alt').click(function () {
          const bookingId = this.parentElement.id;
          fetch('/api/bookings/' + bookingId, {
              method: 'delete'
          }).then(response => location.reload());
      });

})