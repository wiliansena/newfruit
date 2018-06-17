<%-- 
    Document   : editarProduto
    Created on : 14/06/2018, 19:15:04
    Author     : Wilian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Produto</title>
    </head>
    <body>
        <h1>Alteração de Produtos</h1>
        <form action="${pageContext.request.contextPath}/produto/atualizar" method="post">
            <input type="hidden" name="produto.id" value="${produto.id}">
            <p>categoria</p>
            <br/>
            <label>FRUTA</label>
            <input type="radio" name="produto.categoria" value="${produto.categoria}">
            <br/>
            <label>VERDURA</label>
            <input type="radio" name="produto.categoria" value="${produto.categoria}">
            <br/>
            <label>LEGUME</label>
            <input type="radio" name="produto.categoria" value="${produto.categoria}">

            <br/>
            <p>codigo de barras: </p>
            <input type="text" name="produto.codbarra" value="${produto.codbarra}"/>
            <br/>
            <p>Descrição: <p/>
            <input type="text" name="produto.descricao" value="${produto.descricao}"/>
            <br/>
            <p>Nome: </p>
            <input type="text" name="produto.nome" value="${produto.nome}"/>
            <br/>
            <p>preço: </p>
            <input type="text" name="produto.preco" value="${produto.preco}"/>
            <br/>
            <p>Referencia: </p>
            <input type="text" name="produto.referencia" value="${produto.referencia}"/>
            <br/>
            <p>Referencia: </p>
             <input type="text" name="produto.quantidade" value="${produto.quantidade}"/>
            <br/>
            <br/>
            <button type="submit">Atualizar</button>
        </form>
</html>
