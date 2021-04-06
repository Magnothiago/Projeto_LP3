package com.example.systemtransporte.pedagio.domain;


import com.example.systemtransporte.rota.domain.Rotas;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Entity
public class Pedagio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String razaoSocial;

    @Column(unique = true, nullable = false)
    private String cnpj;
    private double valorTarifa;
    private String numeroTelefone;
    private String ddd;

    @ManyToOne
    private Rotas rotas;

    public Pedagio() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(double valorTarifa) {
        this.valorTarifa = valorTarifa;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Rotas getRotas() {
        return rotas;
    }

    public void setRotas(Rotas rotas) {
        this.rotas = rotas;
    }
}
