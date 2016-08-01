<%-- 
    Document   : Login
    Created on : 01-ago-2016, 1:45:14
    Author     : Tatiana Montilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script>
    $(document).ready(function () {
        $("#ValidarUsuario").submit(function () {
            $.post("ValidarUsuario", $("#ValidarUsuario").serialize(), function (data) {
                perfil = jQuery.trim(data);
                if (perfil == 1)
                    $("#mensajeingreso").html("<h1>Usuario o Clave no Valida</h1>");
                   /// document.location.href = "MenuAdmin.jsp";
                else
                    $("#mensajeingreso").html("<h1>Usuario o Clave no Valida</h1>");
            });
            return false;
        });
    });
</script> 
<section class="login">

    <%--Login--%>
    
    

<div class="wrapper">
    <div class="container">
        <h1>Para comenzar. Inicia seccion</h1>
        <form class="form" name="ValidarUsuario" id="ValidarUsuario" action="ValidarUsuario" method="POST" >
            <input type="text" placeholder="Username" name="usuario" id="usuario" value="">
            <input type="password" placeholder="Password" name="clave" id="clave" value="">
            <button type="submit" value="Ingresar" id="login-button" name="login-button">Entrar</button>
        </form>
        
    </div>
    <div id="mensajeingreso"></div>
    <ul class="bg-bubbles">
     
    </ul>
</div>
</section>

