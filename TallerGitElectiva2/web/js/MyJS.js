function cargarUsuarios() {
    var xhr = new XMLHttpRequest;

    xhr.open("GET", "ServletCargaUsers", true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4) {
            var out = JSON.parse(xhr.responseText);
        }
    }
    xhr.send(null);
}

function validarUsuarios() {

    var id = document.getElementById("id").value;
    var pass = document.getElementById("pass").value;
    var xhr = new XMLHttpRequest;
    xhr.open("GET", "ServletValidar?id=" + id + "&pass=" + pass, true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4) {
            alert(xhr.responseText);
            var out = JSON.parse(xhr.responseText);
        }
    }
    xhr.send(null);
}