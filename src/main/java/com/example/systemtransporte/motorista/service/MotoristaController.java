package com.example.systemtransporte.motorista.service;
import com.example.systemtransporte.motorista.business.MotoristaBusiness;
import com.example.systemtransporte.motorista.domain.Motorista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/motorista")
public class MotoristaController {

    @Autowired
    private MotoristaBusiness motoristaBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Motorista> listarMotoristas() {
        return motoristaBusiness.listarMotoristas();
    }

    @PostMapping(path = "/add")
    public void cadastrarMotoristas(@RequestBody Motorista motorista) {

        motoristaBusiness.cadastrarMotorista(motorista);
    }

    @PutMapping(path = "/edit")
    public void editarMotoristas(@RequestBody Motorista motorista) {

        motoristaBusiness.editarMotorista(motorista);
    }


    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody
    void deletarMotoristas(@PathVariable(name = "id") long id) {

        motoristaBusiness.deletarMotorista(id);
    }
}
