package com.example.systemtransporte.veiculo.domain;
import com.example.systemtransporte.entrega.domain.Entrega;
import com.example.systemtransporte.multa.domain.Multa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String modelo;
    private String marca;
    private String ano;
    private double consumoCombustivel;
    private boolean documentacoEmDias;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Entrega> entrega;
    @ManyToOne
    private Veiculo veiculo;
    @OneToMany
    private List<Multa> multas;

    public Veiculo(){
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public List<Entrega> getEntrega() {
        return entrega;
    }

    public void setEntrega(List<Entrega> entrega) {
        this.entrega = entrega;
    }

    public boolean isDocumentacoEmDias() {
        return documentacoEmDias;
    }

    public void setDocumentacoEmDias(boolean documentacoEmDias) {
        this.documentacoEmDias = documentacoEmDias;
    }
}
