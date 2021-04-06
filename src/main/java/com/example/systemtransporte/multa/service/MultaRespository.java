package com.example.systemtransporte.multa.service;

import com.example.systemtransporte.multa.business.MultaBusiness;
import com.example.systemtransporte.multa.domain.Multa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/multa")
public class MultaRespository {


    private MultaBusiness multaBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Multa> listarMultas(){
        return multaBusiness.listarMultas();
    }

    @PostMapping(path = "/add")
    public void cadastrarMultas( @RequestBody Multa multa ){
        multaBusiness.cadastrarMulta(multa);
    }

//    @PutMapping(path = "/edit")
//    public void editarMulta( @RequestBody Multa multa ){
//
//        multaBusiness.(multa);
//    }


    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarMulta(@PathVariable(name = "id") long id){
        multaBusiness.deletarMulta(id);
    }
}
