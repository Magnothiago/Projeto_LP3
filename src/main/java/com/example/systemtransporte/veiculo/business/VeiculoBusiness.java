package com.example.systemtransporte.veiculo.business;
import com.example.systemtransporte.veiculo.domain.Veiculo;
import com.example.systemtransporte.veiculo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Service
@RequestMapping(path = "/api/veiculo")
public class VeiculoBusiness {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Iterable<Veiculo> listarVeiculo() {
        return veiculoRepository.findAll();
    }

    public void cadastrarVeiculo( Veiculo veiculo ) {
        if (validarVeiculo(veiculo)) {
            veiculoRepository.save(veiculo);
        } else{
            System.err.println("Veículo com pendências");
        }
    }

//    public void editarCliente( Cliente cliente ){
//
//        clienteRepositry.save(cliente);
//    }

    public @ResponseBody
    void deletarVeiculo( long id){
        veiculoRepository.deleteById(id);
    }

     boolean validarVeiculo(Veiculo veiculo){
        if (veiculo.isDocumentacoEmDias()){
            return true;
        }
        return false;
    }


}
