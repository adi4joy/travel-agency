$(document).ready(() => {
      $('li.active').removeClass('active');
      $('a[href="' + location.pathname + '"]').closest('li').addClass('active');

    let editVacationId = null;
    $("#search").on("keyup", function() {
        var value = $(this).val().toLowerCase();
        $("#vacationTable tr").filter(function() {
          $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
      });

    $('#modal-save-button').click(() => {
        const name = $('#modal-vacation-name').val();
        const stars = $('#modal-vacation-stars').val();
        const location = $('#modal-vacation-location').val();
        const rating = $('#modal-vacation-rating').val();
        const category = $('#modal-vacation-category').val();
        const price = $('#modal-vacation-price').val();
        const duration = $('#modal-vacation-duration').val();
        const description = $('#modal-vacation-description').val();
        const imageUrl1 = $('#modal-vacation-url1').val();
        const imageUrl2 = $('#modal-vacation-url2').val();
        const imageUrl3 = $('#modal-vacation-url3').val();
        const imageUrls = [];
        if(imageUrl1 !== ''){
            imageUrls.push(imageUrl1);
        }
        if(imageUrl2 !== ''){
            imageUrls.push(imageUrl2);
        }
        if(imageUrl3 !== ''){
            imageUrls.push(imageUrl3);
        }

        const body = {
            name: name,
            stars: stars,
            location: location,
            rating: rating,
            category: category.toUpperCase(),
            price: price,
            duration: duration,
            description: description,
            imageUrl: imageUrls
            }
//        console.log(JSON.stringify(body));
        if (editVacationId === null) {
            addNewVacation(body);
        } else {
            editVacation(editVacationId, body);
        }
    });

    $('.fa-trash-alt').click(function () {
        const vacationId = this.parentElement.id;
        fetch('/api/vacations/' + vacationId, {
            method: 'delete'
        }).then(response => location.reload());
    });

    $('.fa-edit').click(function () {
        editVacationId = this.parentElement.id;
        fetch('/api/vacations/' + editVacationId)
        .then(response => response.json())
        .then(vacation => {
            $('#modal-vacation-name').val(vacation.name);
            $('#modal-vacation-stars').val(vacation.stars);
            $('#modal-vacation-location').val(vacation.location);
            $('#modal-vacation-rating').val(vacation.rating);
            $('#modal-vacation-category').val(vacation.category.toLowerCase()).change();
            $('#modal-vacation-price').val(vacation.price);
            $('#modal-vacation-duration').val(vacation.duration);
            $('#modal-vacation-description').val(vacation.description);
            $('#modal-vacation-url1').val(vacation.imageUrl.length > 0 ? vacation.imageUrl[0].url : '');
            $('#modal-vacation-url2').val(vacation.imageUrl.length > 1 ? vacation.imageUrl[1].url : '');
            $('#modal-vacation-url3').val(vacation.imageUrl.length > 2 ? vacation.imageUrl[2].url : '');
        })

    });

    function addNewVacation(body) {
        fetch('/api/vacations/', {
            method: 'post',
            body: JSON.stringify(body),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(response => {
            location.reload();
        });
    }

    function editVacation(vacationId, body) {
        fetch('/api/vacations/' + vacationId, {
            method: 'put',
            body: JSON.stringify(body),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(() => {
            location.reload();
            editVacationId = null;
        });
    }

    function resetModal(){
        editVacationId = null;
        $('#modal-vacation-name').val('');
        $('#modal-vacation-stars').val('');
        $('#modal-vacation-location').val('');
        $('#modal-vacation-rating').val('');
        $('#modal-vacation-category').val('');
        $('#modal-vacation-price').val('');
        $('#modal-vacation-duration').val('');
        $('#modal-vacation-description').val('');
        $('#modal-vacation-url1').val('');
        $('#modal-vacation-url2').val('');
        $('#modal-vacation-url3').val('');
    }

    $('#addButton').click(function () {
        resetModal();
    })
})
