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
import newfruit.modelo.venda.Venda;
import newfruit.repositorio.dao.VendaRepositorio;

/**
 *
 * @author Wilian
 */
@Controller
@Path("venda")
public class VendaController {
    private VendaRepositorio vendaRepositorio = new VendaRepositorio();
    
    @Get("novo")
   public void vendaForm(){
   
   }
   
   @Post("salvar") 
   public void salvar(Venda venda){  
       System.out.println("Passou aqui " + venda.getDescricao());
      vendaRepositorio.salvarVenda(venda);
   } 
    
}


