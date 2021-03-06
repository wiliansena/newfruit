<%-- 
    Document   : produtoBuscado
    Created on : 16/06/2018, 10:15:25
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
        <c:choose>
            <c:when test="${produtoBuscado.size() eq 0}"> 
                <p>Não há Produtos cadastrados!</p>
            </c:when>
            <c:otherwise>
                <table border="1" style="margin-top: 10px;">
                    <thead>
                        <tr>
                            <th>Categoria</th>
                            <th>Codigo de barra</th>
                            
                            <th>Nome</th>
                            <th>Preço</th>
                            
                            <th>Quantidade</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${produtoBuscado}" var="produto">
                            <tr>
                                <td>${produto.categoria}</td> 
                                <td>${produto.codbarra}</td>
                                
                                <td>${produto.nome}</td> 
                                <td>${produto.preco}</td>
                                
                                <td>${produto.quantidade}</td> 
                                <td>
                                    <a href="${pageContext.request.contextPath}/produto/editar/${produto.codbarra}">Editar</a> ||
                                    <a href="${pageContext.request.contextPath}/produto/excluir/${produto.id}">Excluir</a> ||

                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>    
            </c:otherwise>    
        </c:choose>  
       
    </body>

</html>