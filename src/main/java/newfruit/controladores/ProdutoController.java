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
import br.com.caelum.vraptor.validator.Message;
import br.com.caelum.vraptor.validator.Validator;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.jsp.tagext.ValidationMessage;
import newfruit.modelo.produto.Produto;
import static newfruit.modelo.produto.Produto_.codbarra;
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
    @Inject
    private Validator validator;

    @Get("novo")
    public void produtoForm() {

    }

    @Post("salvar")
    public void salvar(Produto produto) {
        if (produto.getCategoria() == null) {
            result.include("msgError", "Campo CATEGORIA é OBRIGATÓRIO!");
            result.redirectTo(this).produtoForm();
            if (produto.getNome() == null) {
                result.include("msgError", "Campo NOME é OBRIGATÓRIO!");
                result.redirectTo(this).produtoForm();
            }
            if (produto.getCodbarra() == null) {
                result.include("msgError", "Campo CÓDIGO DE BARRAS é OBRIGATÓRIO!");
                result.redirectTo(this).produtoForm();
            }
            if (produto.getPreco() == null) {
                result.include("msgError", "Campo PREÇO é OBRIGATÓRIO!");
                result.redirectTo(this).produtoForm();
            }
            if (produto.getQuantidade() == null) {
                result.include("msgError", "Campo QUANTIDADE é OBRIGATÓRIO!");
                result.redirectTo(this).produtoForm();
            }
        } else {
            produtoRepositorio.SalvarProduto(produto);

            result.include("msgOk", "Produto salvo com sucesso!");
            result.redirectTo(this).produtoForm();

        }
    }

    @Get("buscar/{codbarra}")
    public void buscar(String codbarra
    ) {
        Produto produto = produtoRepositorio.buscarPorCodBarra(codbarra);
        result.include("produtoBuscado", produto);
        System.out.println(produto);

    }

    @Get("lista")
    public void listadeProdutos() {
        List lista = produtoRepositorio.listarTodos();
        result.include("produtoList", lista);
        System.out.println(lista);

    }

    @Get("editar/{codbarra}")
    public void editarProduto(String codbarra
    ) {
        Produto produto = produtoRepositorio.buscarPorCodBarra(codbarra);
        result.include("produto", produto);

    }

    @Post("atualizar")
    public void atualizar(Produto produto
    ) {

        System.out.println("Passou aqui " + produto.getNome());
        produtoRepositorio.atualizarProduto(produto);
        result.redirectTo(this).listadeProdutos();

    }

    @Get("excluir/{id}")
    public void exlcuir(String id
    ) {
        produtoRepositorio.excluir(id);
        result.redirectTo(this).listadeProdutos();
    }

}
