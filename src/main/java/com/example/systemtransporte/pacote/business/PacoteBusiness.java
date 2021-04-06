package com.example.systemtransporte.pacote.business;


import com.example.systemtransporte.pacote.domain.Pacote;
import com.example.systemtransporte.pacote.repository.PacoteRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacoteBusiness {


    @Autowired
    private PacoteRespository pacoteRespository;


    public Iterable<Pacote> listarPacote(){
        return pacoteRespository.findAll();

    }



    public void mandarPacote(Pacote pacote){
        if (validarPacote(pacote)){
            pacoteRespository.save(pacote);
        }else{
            System.out.println("Por favor, verifique as informações do pacote");
        }
    }


    public void editarPacoteNoSistema(Pacote pacote){
        pacoteRespository.save(pacote);
    }


    public void deletarPacoteNoSistema(long id){
        pacoteRespository.deleteById(id);
    }


    boolean validarPacote(Pacote pacote){
        if(pacote.getDestino()!= null && pacote.getCliente().getCpf()!= null){
            return true;
        }else {
            return false;
        }
    }

}
