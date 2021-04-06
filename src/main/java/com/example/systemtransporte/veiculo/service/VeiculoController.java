package com.example.systemtransporte.veiculo.service;
import com.example.systemtransporte.veiculo.business.VeiculoBusiness;
import com.example.systemtransporte.veiculo.domain.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoBusiness veiculoBusiness;


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Veiculo> listarVeiculo(){
        return veiculoBusiness.listarVeiculo();
    }


    @PostMapping(path = "/add")
    public void cadastrarVeiculo( @RequestBody Veiculo veiculo ){
        veiculoBusiness.cadastrarVeiculo(veiculo);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarVeiculo(@PathVariable(name = "id") long id){
        veiculoBusiness.deletarVeiculo(id);
    }



}
