<%-- 
    Document   : cadastro
    Created on : 17/06/2018, 17:36:09
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script>
function salvar(){

alert("Produto cadastrado");

}
</script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="js/materialize.js"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"/>
<link rel="stylesheet" type="text/css" href="css/materialize.css"/>


<title>Cadastro</title>


</head>
<body style="background-image:url('fundo.jpg');">
<nav>
    <div class="nav-wrapper  blue">
      <a href="#!" class="brand-logo"><i class="material-icons">dashboard</i>Cadastro</a>
      <ul class="right hide-on-med-and-down">
        <li><a href="index"><i class="material-icons">exit_to_app</i></a></li>
      </ul>
    </div>
  </nav>
     <ul class="errors">
       <p>${msgError}</p>
       <p>${msgOk}</p>
<form action="${pageContext.request.contextPath}/produto/salvar" method="post">
     <table>
        <thead>
          <tr>
              <th><h4>Categoria</h4></th>
              <th><h4>Codigo</h4></th>
              <th><h4>Nome</h4></th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td><label>
        <input type="radio" class="with-gap" name="produto.categoria" value="fruta" />
        <span style="color: black;">Fruta</span>
      </label>
	       <label>
        <input type="radio" class="with-gap" name="produto.categoria" value="verdura" />
        <span style="color: black;">Verdura</span>
      </label>
	      <label>
        <input type="radio" class="with-gap" name="produto.categoria" value="legume"/>
        <span style="color: black;">Legume</span>
      </label></td>
            <td><input class="input-field col s1" type="text" name="produto.codbarra"/></td>
            <td><input class="input-field col s1" type="text" name="produto.nome"/></td>
          </tr>
		   <thead>
          <tr>
              <th><h4>Quantidade</h4></th>
              <th><h4>Preço</h4></th>
          </tr>
        </thead>
<tr>
            <td>
        <input type="text" name="produto.quantidade"/>
        
	    </td>
            <td><input type="text" name="produto.preco"/></td>
          </tr>
        </tbody>
      </table><br><br><br>
	  <center>
	  <button class="btn waves-effect blue" type="submit" name="action" onclick="salvar()">Salvar
    <i class="material-icons right">assignment_turned_in</i>
  </button>
  <button class="btn waves-effect blue" type="reset" name="action">limpar
    <i class="material-icons right">cancel</i>
  </button>
	  
	  </center>
</form>
</body>
</html>
