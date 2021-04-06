package com.example.systemtransporte.entrega.service;
import com.example.systemtransporte.entrega.business.EntregaBusiness;
import com.example.systemtransporte.entrega.domain.Entrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RequestMapping(path = "/api/entrega")
public class EntregaController {

    @Autowired
    private EntregaBusiness entregaBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Entrega> listarEntrega(){
        return entregaBusiness.listarEntregas();
    }

    @PostMapping(path = "/add")
    public void cadastrarEntrega( @RequestBody Entrega entrega ){
        entregaBusiness.cadastrarEntrega(entrega);
    }

    @PutMapping(path = "/edit")
    public void editarEntrega( @RequestBody Entrega entrega ){
        entregaBusiness.editarEntrega(entrega);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarEntrega(@PathVariable(name = "id") long id){
        entregaBusiness.deletarEntrega(id);
    }

}
