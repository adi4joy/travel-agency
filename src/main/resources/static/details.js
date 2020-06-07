$(document).ready(function() {
  $('li.active').removeClass('active');
  $('a[href="' + location.pathname + '"]').closest('li').addClass('active');

      let editBookingId = null;

    $('#bookButton').click(() => {
        const name = $('#modal-vacation-name').val();
        const stars = $('#modal-vacation-stars').val();
        const location = $('#modal-vacation-location').val();
        const rating = $('#modal-vacation-rating').val();
        const category = $('#modal-vacation-category').val();
        const price = $('#modal-vacation-price').val();
        const duration = $('#modal-vacation-duration').val();


        const body = {
            name: name,
            stars: stars,
            location: location,
            rating: rating,
            category: category.toUpperCase(),
            price: price,
            duration: duration,
            }
        console.log(JSON.stringify(body));
        if (editBookingId === null) {
            addNewBooking(body);
        } else {
            editBooking(editBookingId, body);
        }
    });

    $('#bookVacation').click(function () {
        editBookingId = this.parentElement.id;
        fetch('/api/bookings/' + editBookingId)
        .then(response => response.json())
        .then(vacation => {
            $('#modal-vacation-name').val(vacation.name);
            $('#modal-vacation-stars').val(vacation.stars);
            $('#modal-vacation-location').val(vacation.location);
            $('#modal-vacation-rating').val(vacation.rating);
            $('#modal-vacation-category').val(vacation.category.toLowerCase()).change();
            $('#modal-vacation-price').val(vacation.price);
            $('#modal-vacation-duration').val(vacation.duration);
        })

    });

})