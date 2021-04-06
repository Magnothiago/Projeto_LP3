package com.example.systemtransporte.pacote.service;


import com.example.systemtransporte.pacote.business.PacoteBusiness;
import com.example.systemtransporte.pacote.domain.Pacote;
import com.example.systemtransporte.pacote.repository.PacoteRespository;
import org.springframework.http.MediaType;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path = "/api/pacote")
public class PacoteController {

        private PacoteBusiness pacoteBusiness;

        @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
        public Iterable<Pacote> listarPacote(){
            return pacoteBusiness.listarPacote();
        }

        @PostMapping(path = "/add")
        public void cadastrarPacote(@RequestBody Pacote pacote){
            pacoteBusiness.mandarPacote(pacote);
        }

        @PutMapping(path = "/edit")
        public void editarPacote(@RequestBody Pacote pacote){
            pacoteBusiness.editarPacoteNoSistema(pacote);
        }

        @DeleteMapping(value = "/delete/{id}")
        public @ResponseBody void deletarPacote(@PathVariable(name = "id")long id){
            pacoteBusiness.deletarPacoteNoSistema(id);
        }


}
