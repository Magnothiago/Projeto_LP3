package com.example.systemtransporte.entrega.domain;
import com.example.systemtransporte.rota.domain.Rotas;
import com.example.systemtransporte.veiculo.domain.Veiculo;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
public class Entrega implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomePessoa;
    private String cpfPEssoa;
    private String enderecoEntrega;
    private LocalDate prazo;
    @ManyToOne
    private Rotas rotas;
    @OneToOne
    private Status status;
    @ManyToOne
    private Veiculo veiculo;

    public Entrega() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpfPEssoa() {
        return cpfPEssoa;
    }

    public void setCpfPEssoa(String cpfPEssoa) {
        this.cpfPEssoa = cpfPEssoa;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public Rotas getRotas() {
        return rotas;
    }

    public void setRotas(Rotas rotas) {
        this.rotas = rotas;
    }
}
