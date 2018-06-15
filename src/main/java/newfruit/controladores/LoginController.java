/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfruit.controladores;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import java.util.List;
import javax.inject.Inject;
import newfruit.anotações.Private;
import newfruit.componentes.UserSession;
import newfruit.modelo.usuario.User;

/**
 *
 * @author Wilian
 */
@Controller
public class LoginController {
    
    @Inject
    private UserSession userSession;
    @Inject
    private Result result;
    
    @Get("login")
    @Private
    public void getLoginView(){
                
    }
    
    @Post("autenticar")
    public void authenticate(User user){
        System.out.println("LoginController "  + user);
       List<User> users = userSession.getUsers();
       if (userSession.getUsers().get(0).equals(user)){
          userSession.setUserLogged(user);
          result.redirectTo(IndexController.class).index();
       }else{
           //Mandar de volta para view de login
           //Como mensagem de erro. 
          result.include("msgLoginError", "Usuário ou senha inválidos!");
          result.redirectTo(this).getLoginView();
       }
    }
    
    @Get("sair")
    public void logout(){
        userSession.logout();
        result.redirectTo(this).getLoginView();
    }
    
}
