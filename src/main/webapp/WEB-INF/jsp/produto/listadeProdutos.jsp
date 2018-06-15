<%-- 
    Document   : listadeProdutos
    Created on : 14/06/2018, 11:27:32
    Author     : Wilian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Produtos</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/lista" method="post">
            <label for="inputField">Pesquisar</label>
            <input id="inputField" type="text" name="query">
            <button type="submit">Pesquisar</button>
        </form>
        <p>Não há produtos cadastrados!</p>
        <table border="1" style="margin-top: 10px;">
            <thead>
                <tr>
                    <th>Categoria</th>
                    <th>Codigo de barra</th>
                    <th>Descricao</th>
                    <th>Nome</th>
                    <th>Preço</th>
                    <th>Referencia</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${produtoList}" var="produto">
                    <tr>
                        <td>${produto.categoria}</td> 
                        <td>${produto.codbarra}</td>
                        <td>${produto.descricao}</td>
                        <td>${produto.nome}</td> 
                        <td>${produto.preco}</td>
                        <td>${produto.referencia}</td> 
                        <td>
                            <a href="${pageContext.request.contextPath}/produto/editar/${produto.codbarra}">Editar</a> ||
                            <a href="${pageContext.request.contextPath}/produto/excluir/${produto.id}">Excluir</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>    

    </body>

</html>
