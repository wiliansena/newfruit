/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfruit.modelo.venda;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import newfruit.modelo.produto.Produto;


/**
 *
 * @author Wilian
 */
//@Entity
public class IntemVenda {
    private Integer id;
    private Integer qtde;
    @ManyToOne
    @JoinColumn
    private Produto produto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
