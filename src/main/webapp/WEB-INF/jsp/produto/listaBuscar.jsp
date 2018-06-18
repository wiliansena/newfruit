<%-- 
    Document   : buscar
    Created on : 18/06/2018, 12:35:52
    Author     : Wilian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Eu sou a pagina de busca</h1>
         <form action="${pageContext.request.contextPath}/produtoBuscado" method="post">
            <label for="inputField">Pesquisar</label>
           <input id="inputField" type="text" name="produto.codbarra"/>
           
            <button type="submit" >Buscar</button>
        </form>
    </body>
</html>
