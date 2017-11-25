<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    String usuario = "";
    String pass = "";
%>
<%
    HttpSession sesionOn = request.getSession();
    if (sesionOn.getAttribute("user") == null) {
%>
<script type="text/javascript">
    alert("Por favor inicia sesion");
    location.href = "index.html";
</script>
<%} else {
        usuario = (String) sesionOn.getAttribute("user");
        pass = (String) sesionOn.getAttribute("pass");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/materialize.min.css">
        <link rel="stylesheet" href="font/material-design-icons/material-icons.css">
        <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.css">
        <link rel="stylesheet" href="css/animate.css">
        <title>Taller Electiva 2</title>
    </head>

    <body>
        <!--Colocamos la barra de navegación fija-->
        <div class="navbar-fixed">
            <!--Creamos una barra de navegación-->
            <nav>
                <!--Aca abajo mediante la clase teal asignamos otro color a la navbar y mediante el darken y lighten asignamos oscuridad o luz a la barra-->
                <div class="nav-wrapper teal darken-2">
                    <ul class="right hide-on-med-and-down">
                        <li><a href="logout.jsp" id=""><i class="fa fa-sign-out"></i> Cerrar Sesión</a></li>
                    </ul>
                </div>
            </nav>
        </div>

        <div class="container">
            <div class="row">
                <div class="col l12 m4 s6"></div>
                <div class="col l12 m6 s6">

                </div>
                <div class="col l12 m6 s6"></div>
            </div>
        </div>
        <footer class="page-footer teal darken-2">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Electiva II</h5>
                        <p class="grey-text text-lighten-4">Desarrollo taller electiva II usando JSP y mysql</p>
                    </div>
                    <div class="col l4 offset-l2 s12">
                        <h5 class="white-text">Desarrollado por:</h5
                        <p class="grey-text text-lighten-4"><i class="fa fa-user"></i> David Lara Diaz</p>
                        <p class="grey-text text-lighten-4"><i class="fa fa-user"></i> Juan David Cáceres</p>
                        <p class="grey-text text-lighten-4"><i class="fa fa-user"></i> Alexander Deaquiz</p>
                    </div>
                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    © 2017 Copyright
                </div>
            </div>
        </footer>

        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.js"></script>
        <script src="js/jquery-1.11.1.min.js"></script>
        <script>new WOW().init();</script>
        <script>
            $(document).ready(function () {
                $(".button-collapse").sideNav();
            });
        </script>
        <script src="js/MyJS.js"></script>
    </body>

</html>

