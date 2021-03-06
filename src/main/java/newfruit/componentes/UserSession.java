/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newfruit.componentes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import newfruit.modelo.usuario.User;

/**
 *
 * @author Wilian
 */
//Nome do bean em sessão
@Named("userSession")
@SessionScoped
//Serializable  -> Guarda o estado do objeto em memória
public class UserSession implements Serializable{
    
    private List<User> users  = new ArrayList<>();
    private User userLogged;
    
    
    public UserSession() {
       users.add(new User("wilian", "123"));
      
    }

    public User getUserLogged() {
        return userLogged;
    }

    public void setUserLogged(User userLogged) {
        this.userLogged = userLogged;
    }
    
    public boolean isUserLogged(){
         return userLogged != null;
    }
    public void addUser(User user){
       users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void deleteAll(){
        users = new ArrayList<>();
    }  
    
    public void logout(){
        userLogged = null;
    }
}
