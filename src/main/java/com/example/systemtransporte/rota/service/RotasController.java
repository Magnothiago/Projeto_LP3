package com.example.systemtransporte.rota.service;
import com.example.systemtransporte.rota.business.RotasBusiness;
import com.example.systemtransporte.rota.domain.Rotas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/rotas")
public class RotasController {

    @Autowired
    private RotasBusiness rotasBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Rotas> listarRotas(){
        return rotasBusiness.listarRotas();
    }

    @PostMapping(path = "/add")
    public void cadastrarRotas(@RequestBody Rotas rotas){
        rotasBusiness.cadastrarRotas(rotas);
    }

    @PutMapping(path = "/edit")
    public void editarRotas(@RequestBody Rotas rotas){
        rotasBusiness.editarRotas(rotas);
    }

    @DeleteMapping(value = "/deletar/{id}")
    public @ResponseBody void deletarRotas(@PathVariable(name = "id")long id){
        rotasBusiness.deletarRotas(id);
    }

}
