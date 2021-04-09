package com.example.systemtransporte.cliente.service;

import com.example.systemtransporte.cliente.business.ClienteBusiness;
import com.example.systemtransporte.cliente.domain.Cliente;
import com.example.systemtransporte.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="/api/cliente")
public class ClienteController {


    @Autowired
    private ClienteBusiness clienteBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Cliente> listarCliente(){
        return clienteBusiness.listarCliente();
    }

    @PostMapping(path = "/add")
    public void cadastrarCliente(@RequestBody Cliente cliente){
        clienteBusiness.cadastrarCliente(cliente);
    }

    @PutMapping(path = "/edit")
    public void editarCliente(@RequestBody Cliente cliente){
        clienteBusiness.editarCliente(cliente);
    }
    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarCliente(@PathVariable(name = "id")long id){
        clienteBusiness.deletarCliente(id);
    }


}
