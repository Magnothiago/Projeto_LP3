package com.example.systemtransporte.transportadora.domain;
import com.example.systemtransporte.rota.domain.Rotas;
import javax.persistence.*;
import java.util.List;


@Entity
public class Transportadora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String razaoSocial;
    @Column(unique = true, nullable = false)
    private String cnpj;
    private String email;
    private String numeroTelefone;
    private String ddd;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Rotas> rotas;

    public Transportadora() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<Rotas> getRotas() {
        return rotas;
    }

    public void setRotas(List<Rotas> rotas) {
        this.rotas = rotas;
    }
}
