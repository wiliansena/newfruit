/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfruit.controladores;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import java.io.Serializable;
import static java.lang.reflect.Array.get;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import newfruit.modelo.produto.Produto;
import newfruit.repositorio.dao.ProdutoRepositorio;

/**
 *
 * @author Wilian
 */
@Controller
@Path("produto")
public class ProdutoController implements Serializable {

    private ProdutoRepositorio produtoRepositorio = new ProdutoRepositorio();
    @Inject
    private Result result;

    @Get("novo")
    public void produtoForm() {

    }

    @Post("salvar")
    public void salvar(Produto produto) {

        System.out.println("Passou aqui " + produto.getNome());
        produtoRepositorio.SalvarProduto(produto);

    }

    public List<Produto> buscar() {
        List lista = produtoRepositorio.buscar("34343434");
        System.out.println(lista);
        return lista;
    }

    @Get("lista")
    public void listadeProdutos() {
        List lista = produtoRepositorio.listarTodos();
        result.include("produtoList", lista);
        System.out.println(lista);

    }

    @Get("editar/{codbarra}")
    public void editarProduto(String codbarra) {
        Produto produto = produtoRepositorio.buscarPorCodBarra(codbarra);
        result.include("produto", produto);
    }

    @Post("atualizar")
    public void atualizar(Produto produto) {

        System.out.println("Passou aqui " + produto.getNome());
        produtoRepositorio.atualizarProduto(produto);
        result.redirectTo(this).listadeProdutos();

    }

    @Get("excluir/{id}")
    public void exlcuir(String id) {
      produtoRepositorio.excluir(id);
      result.redirectTo(this).listadeProdutos();
    }
}
