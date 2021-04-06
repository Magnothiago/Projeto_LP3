package com.example.systemtransporte.multa.business;
import com.example.systemtransporte.multa.domain.Multa;
import com.example.systemtransporte.multa.repository.MultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class MultaBusiness {

    @Autowired
    private MultaRepository multaRepository;

    public Iterable<Multa> listarMultas(){
        return multaRepository.findAll();
    }

    public void cadastrarMulta(Multa multa){
        if (validarMulta(multa)){
            multaRepository.save(multa);
        }else{
            System.out.println("Verifique os valores digitados");
        }
    }

    public @ResponseBody
    void deletarMulta( long id){
        multaRepository.deleteById(id);
    }

    private boolean validarMulta(Multa multa){
        if(!multa.getPlaca().isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
