<%-- 
    Document   : getLoginView
    Created on : jun 08, 2018, 23:01:18 PM
    Author     : Wilian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"/>
        <link rel="stylesheet" type="text/css" href="css/materialize.css"/>
        <link rel="stylesheet" type="text/css"  href="getLoginView.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>


    </head>
    <body style="background-image:url('fundo.jpg');">
        <p>${msgLoginError}</p>
        <form action="${pageContext.request.contextPath}/autenticar" method="post">
            <div id="campos">


                <a class="btn-floating btn-small"><i class="material-icons  blue">person</i>usuario</a>
                <input type="text" name="user.name" value="" placeholder="usuario" id="email"/>
                <a class="btn-floating btn-small"><i class="material-icons  blue">lock_outline</i>usuario
                </a><input type="password" name="user.password" value="" placeholder="senha"  id="senha" />
                <button type="submit">Entrar</button>
            </div>

        </form>
    </body>	
</html>