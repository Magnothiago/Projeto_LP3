package com.example.systemtransporte.usuario.business;
import com.example.systemtransporte.usuario.domain.Usuario;
import org.springframework.stereotype.Service;

@Service


public class UsuarioBusiness {

 public Usuario realizarLogin(Usuario user){

     if((user == null || user.getSenha() == null) || user.getUser() == null
             || user.getUser().equalsIgnoreCase("") || user.getSenha().equalsIgnoreCase("")){
         return null;
     }
     return user;
 }

}
