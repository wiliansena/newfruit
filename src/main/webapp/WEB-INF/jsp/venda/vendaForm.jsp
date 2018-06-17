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
        <title>Vendas</title>
    </head>
    <body>
        <h1>Cadastro de Vendas</h1>
        <form action="${pageContext.request.contextPath}/venda/salvar" method="post">
            <p>Item da venda: <p/>
            <input type="text" name="produto.id"/>
            <br/>
            <p>Descrição: <p/>
            <input type="text" name="venda.descricao"/>
            <br/>
            <p>Data: </p>
            <input type="text" name="venda.data"/>
            <br/>
            <br/>
            <p>Forma de pagamento</p>
            <br/>
            <label>DINHEIRO</label>
            <input type="radio" name="venda.formpagamento" value="dinheiro">
            <br/>
            <label>CHEQUE</label>
            <input type="radio" name="venda.formpagamento" value="cheque">
            <br/>
            <label>CARTÃO</label>
            <input type="radio" name="venda.formpagamento" value="cartao">
            <br/>
            <p>Quantidade: </p>
            <input type="text" name="produto.quantidade"/>
            <br/>
            <button type="submit">Salvar</button>
        </form>

    </body>
</html>
