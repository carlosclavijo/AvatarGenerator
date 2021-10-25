$(document).ready(function () {

});

getBodies();

function getBodies() {
    jQuery.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'type': 'GET',
        'url': 'api/body/get',
        'dataType': 'json', // lo que se recibe 
        'success': showBodies
    });
}

function showBodies(response) {
    if (response.success) {
        var list = response.response;
        for (var i in list) {
            console.log(list[i]);
        }
    }
}