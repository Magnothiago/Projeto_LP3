package com.example.systemtransporte.entrega.business;

import com.example.systemtransporte.cliente.domain.Cliente;
import com.example.systemtransporte.entrega.domain.Entrega;
import com.example.systemtransporte.entrega.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;


@Service
public class EntregaBusiness {


    @Autowired
    private EntregaRepository entregaRepository;


    public Iterable<Entrega> listarEntregas() {
        return entregaRepository.findAll();
    }

    public void cadastrarEntrega(Entrega entrega) {
        if (validarEntrega(entrega)) {
            entregaRepository.save(entrega);
        }
    }

    public void editarEntrega(Entrega entrega) {

        entregaRepository.save(entrega);
    }

    public @ResponseBody
    void deletarEntrega(long id) {
        entregaRepository.deleteById(id);

    }


    public boolean validarEntrega(Entrega entrega) {
        if (!entrega.getCpfPEssoa().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
