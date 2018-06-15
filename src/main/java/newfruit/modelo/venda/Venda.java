/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfruit.modelo.venda;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Wilian
 */
//@Entity
public class Venda {

    @Id
    private Integer id;
    private String descricao;
    private Date data;
    private Integer valortotal;
   @Column(nullable = false)
    private String FormPagamento;

     
     @OneToMany
    @JoinColumn
    private IntemVenda intemvenda;
    
   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IntemVenda getIntemvenda() {
        return intemvenda;
    }

    public void setIntemvenda(IntemVenda intemvenda) {
        this.intemvenda = intemvenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;

    }

    public String getFormPagamento() {
        return FormPagamento;
    }

    public void setFormPagamento(String FormPagamento) {
        this.FormPagamento = FormPagamento;
    }



    public Integer getValortotal() {
        return valortotal;
    }

    public void setValortotal(Integer valortotal) {
        this.valortotal = valortotal;
    }

}
