(function ($, window, undefined) {
    const url = 'http://localhost:8080/add-new-user'
    let form = document.querySelector('#registrationForm');
    form.addEventListener('submit', function (event) {
        // Prevent form from submitting to the server
        event.preventDefault();
        // Do some stuff...
        fetch(url, {
            method: 'POST',
            headers: {
                'Content-type': 'application/json; charset=UTF-8'
            },
            body: JSON.stringify(serializeForm(event.target))
        }).then((response) => {
            // do something with response here...
            console.log(response.statusText);
            //todo: need to redirect to login.html page
        });
    });

    function serializeForm(form){
        let obj = {};
        let formData = new FormData(form);
        formData.forEach((value,key) => {
            obj[key] = value;
        })
        return obj;
    }
})();
