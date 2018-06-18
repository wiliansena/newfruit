<%-- 
    Document   : inicio
    Created on : 17/06/2018, 17:28:32
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script>
</script>
<script src="js/materialize.min.js"></script>
<script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"/>
<link rel="stylesheet" type="text/css" href="css/materialize.min.css"/>
<link rel="stylesheet" type="text/css"  href="index.css"/>

<title>Cadastro</title>

</head>
<body style="background-image:url('fundo.jpeg');">
<form action="" method="post">
 <nav>
    <div class="nav-wrapper  blue">
      <a href="#!" class="brand-logo"><i class="material-icons">dashboard</i>New Fruit</a>
      <ul class="right hide-on-med-and-down">
         <li><a href="${pageContext.request.contextPath}/produto/buscar"><i class="material-icons">developer_board</i></a></li>
        <li><a href="${pageContext.request.contextPath}/produto/lista"><i class="material-icons">developer_board</i></a></li>
        <li><a href="${pageContext.request.contextPath}/produto/novo"><i class="material-icons">add_shopping_cart</i></a></li>
        <li><a href="login"><i class="material-icons">exit_to_app</i></a></li>
      </ul>
    </div>
  </nav>
</form>
<span id="span" style="color: black;"><marquee behavior=scroll scrolldelay="10"><h2>Sejam Bem vindos!!!</h2></marquee></span>
</body>
</html>