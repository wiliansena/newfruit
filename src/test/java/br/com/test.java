/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

import java.util.List;
import newfruit.modelo.produto.Produto;
import newfruit.repositorio.dao.ProdutoRepositorio;

/**
 *
 * @author Wilian
 */
public class test {

    static private ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();

    //SALVANDO UM PRODUTO
    public static void main(String[] args) {
        List<Produto> pro = produtoRepositorio.buscar("banana");
        Produto p = new Produto();
        p.gerarID();
        p.setCategoria("fruta");
        p.setCodbarra("12345678");
        p.setNome("banana");
        p.setPreco("12,00");

        produtoRepositorio.SalvarProduto(p);
    }

}
