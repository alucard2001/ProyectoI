9<%-- 
    Document   : Menu
    Created on : 28-feb-2016, 17:27:52
    Author     : Alucard
--%>

<header> 
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="display: block;">
        <div class="container">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navegacion-sf">
                    <span class="sr-only">este es el boton desplegave</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>                    
                </button>
                <a class="navbar-brand page-scroll" href="#">Sonrisa Feliz</a>
            </div>
            <!--menu-->
            <div class="collapse navbar-collapse " id="navegacion-sf" >
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index.jsp" onclick="$('header').animatescroll({padding: 71})">Inicio</a></li> 

                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" role="button">
                            Conocenos <span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#" onclick="$('.services').animatescroll({padding: 71})">Servicios</a></li>
                            <li class="divider"></li>
                            <li><a href="#" onclick="$('.quienessomos').animatescroll({padding: 71})">Quienes Somos</a></li>
                            <li class="divider"></li>
                            <li><a href="#" onclick="$('.mision').animatescroll({padding: 71})">Vision y Mision</a></li>
                            <li class="divider"></li>
                            <li><a href="#" onclick="$('.valores').animatescroll({padding: 71})">Valores</a></li>
                            <li class="divider"></li>
                            <li><a href="#" onclick="$('.staff').animatescroll({padding: 71})">Staff</a></li>
                            <li class="divider"></li>
                            <li><a href="#" onclick="$('.garantia').animatescroll({padding: 71})">Garantia</a></li>

                        </ul>
                    </li>
                    <li><a href="partes/PRUEVAS.jsp#"onclick="$('.oferta').animatescroll({padding: 71})">Ofertas</a></li>
                    <li><a href="#" onclick="$('.contactos').animatescroll({padding: 71})">Contactenos</a></li>
                        <%--login--%>
                    <script>
                        $(document).ready(function () {
                            $("#ValidarUsuario").submit(function () {
                                $.post("ValidarUsuario", $("#ValidarUsuario").serialize(), function (data) {
                                    perfil = jQuery.trim(data);
                                    if (perfil == 1)
                                        $("#mensajeingreso").html("<h1>Usuario o Clave no Valida</h1>");
                                    //document.location.href = "MenuAdmin.jsp";
                                    else
                                        $("#mensajeingreso").html("<h1>Usuario o Clave no Valida</h1>");
                                });
                                return false;
                            });
                        });
                    </script> 
                    <li class="dropdown">
                        <a href="partes/Login.jsp#" class="dropdown-toggle glyphicon glyphicon-lock" data-toggle="dropdown"><span class="caret"></span></a>
                        <ul id="login-dp" class="dropdown-menu">
                            <li>
                                <div class="row">
                                    <div class="col-md-12">
                                        <form  name="ValidarUsuario" id="ValidarUsuario" action="ValidarUsuario" method="POST">
                                            <div class="form-group">
                                                <label class="sr-only" for="exampleInputEmail2">Usuario</label>
                                                <input type="text" placeholder="Username" name="usuario" id="usuario" value="" class="form-control" required >
                                            </div>
                                            <div class="form-group">
                                                <label class="sr-only" for="exampleInputPassword2">Password</label>
                                                <input type="password" placeholder="Password" name="clave" id="clave" value="" class="form-control" required>

                                            </div>
                                            <div class="form-group">
                                                <button type="submit" class="btn btn-primary btn-block">Sign in</button>

                                            </div>
                                        </form>
                                    </div>
                                    <div class="bottom text-center">
                                        <div ></div>
                                        <a id="mensajeingreso"><b></b></a>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </li>
            </div>
        </div>
    </nav>
</header>
