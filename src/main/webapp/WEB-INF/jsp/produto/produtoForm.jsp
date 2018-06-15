<%-- 
    Document   : produtoForm
    Created on : 18/10/2007, 00:30:27
    Author     : Wilian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Produto</title>
    </head>
    <body>
        <h1>Cadastro de Produtos</h1>
        <form action="${pageContext.request.contextPath}/produto/salvar" method="post">

            <p>categoria</p>
            <br/>
            <label>FRUTA</label>
            <input type="radio" name="produto.categoria" value="fruta">
            <br/>
            <label>VERDURA</label>
            <input type="radio" name="produto.categoria" value="verdura">
            <br/>
            <label>LEGUME</label>
            <input type="radio" name="produto.categoria" value="legume">

            <br/>
            <p>codigo de barras: </p>
            <input type="text" name="produto.codbarra"/>
            <br/>
            <p>Descrição: <p/>
            <input type="text" name="produto.descricao"/>
            <br/>
            <p>Nome: </p>
            <input type="text" name="produto.nome"/>
            <br/>
            <p>preço: </p>
            <input type="text" name="produto.preco"/>
            <br/>
            <p>Referencia: </p>
            <input type="text" name="produto.referencia"/>
            <br/>
            <button type="submit">Salvar</button>
        </form>
        
    </body>
</html>
