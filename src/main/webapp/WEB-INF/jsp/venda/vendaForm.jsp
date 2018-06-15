<%-- 
    Document   : vendaForm
    Created on : 12/06/2018, 16:36:47
    Author     : Wilian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form de Vendas</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="${pageContext.request.contextPath}/venda/salvar" method="post">
            <input type="text" name="produto.id"/>
            <input type="text" name="produto.descricao"/>
            <input type="text" name="produto.data"/>
            <input type="text" name="produto.intemvenda"/>
            <input type="text" name="produto.formPagEnum"/>
            <button type="submit">Salvar</button>
        </form>
    </body>
</html>
