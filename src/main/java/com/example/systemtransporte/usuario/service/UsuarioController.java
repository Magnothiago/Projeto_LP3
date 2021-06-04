package com.example.systemtransporte.usuario.service;
import com.example.systemtransporte.cliente.domain.Cliente;
import com.example.systemtransporte.usuario.business.UsuarioBusiness;
import com.example.systemtransporte.usuario.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path ="/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioBusiness usuarioBusiness;

    @PostMapping(path = "/logar")
    public ResponseEntity<?> logar(@RequestBody Usuario usuario){
        try {
//            usuarioBusiness.realizarLogin(usuario);
            return new ResponseEntity<>(usuarioBusiness.realizarLogin(usuario), HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
        }
    }



}
