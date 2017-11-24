function validar() {
    alert("Entro funcion");
    var sesion = false;
    var xhr = new XMLHttpRequest();

    xhr.open("POST", "ServletManagement", true);
    alert(xhr.responseText);
    xhr.onreadystatechange = function () {

        if (xhr.readyState == 4) {
            var usuarios = JSON.parse(xhr.responseText);
            alert("Hola k hace", usuarios);
            var select = document.getElementById("");

        }
    }
    xhr.send(null);
    return sesion;
}





