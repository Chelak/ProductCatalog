(function ($, window, undefined) {
    const url = 'http://localhost:8080/login'
    let form = document.querySelector('#loginForm');

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