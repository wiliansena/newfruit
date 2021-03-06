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
import javax.inject.Inject;
import newfruit.anotações.Private;
import newfruit.componentes.UserSession;
import newfruit.modelo.usuario.User;

/**
 *
 * @author wilian
 */
@Controller
@Private
@Path("usuario")//Define um caminho (inicial - prefixo) para todas as ações do controller
public class UserController {

    /*Result (VRaptor) = Permite modificar rotas e incluir objetos que 
    serão exibidos na view
     */
    @Inject
    private Result result;

    @Inject
    private UserSession userSession;

    //usuario/novo
    @Get("novo")
    public void registerView() {
      
    }

    @Get("pesquisar")
    public void usersView(){
       result.include("userList", userSession.getUsers());
    }
    
    @Get("editar/{name}")
    public void editView(String name){
        User user = null;
        for(User userFromList : userSession.getUsers()){
           if (userFromList.getName().equalsIgnoreCase(name)){
              user = userFromList;
           }
        }
        result.include("user", user);
    }
    
    //usuario/salvar
    @Post("salvar")
    public void save(User user) {
        userSession.addUser(user);
        /*
        Redireciona (SendRedirect) para uma rota do próprio (this) 
        controller. No caso, a rota é registerView
         */
        result.redirectTo(this).registerView();
    }
    
    @Post("atualizar")
    public void update(User user){
        
    }

    @Get("apagar")
    public void delete() {
        userSession.deleteAll();
        result.redirectTo(this).registerView();
    }
}
