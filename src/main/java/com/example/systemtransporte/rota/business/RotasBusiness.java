package com.example.systemtransporte.rota.business;

import com.example.systemtransporte.rota.domain.Rotas;
import com.example.systemtransporte.rota.repository.RotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Struct;

@Service
public class RotasBusiness {

    @Autowired
    private RotasRepository rotasRepository;


    public Iterable<Rotas> listarRotas(){
        return rotasRepository.findAll();
    }

    public void cadastrarRotas(Rotas rotas){
        if (validarRotas(rotas)){
            rotasRepository.save(rotas);
        }else{
            System.out.println("Rota inválida");
        }
    }

    public  void editarRotas(Rotas rotas){
        rotasRepository.save(rotas);
    }

    public @ResponseBody
    void deletarRotas(long id) {
        rotasRepository.deleteById(id);
    }

    public boolean validarRotas(Rotas rotas){
        if (!rotas.getDestino().isEmpty()){
            return true;
        }else {
            return false;
        }
    }


}
