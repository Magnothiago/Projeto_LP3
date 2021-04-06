package com.example.systemtransporte.rota.domain;
import com.example.systemtransporte.entrega.domain.Entrega;
import com.example.systemtransporte.pedagio.domain.Pedagio;
import com.example.systemtransporte.transportadora.domain.Transportadora;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Rotas implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double distancia;
    private double duracao;
    private String destino;
    private double valorFrete;

    @ManyToOne
    private Transportadora transportadora;
    @OneToMany
    private List<Pedagio> pedagio;
    @OneToMany
    private List<Entrega> entregas;

    public Rotas() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public List<Pedagio> getPedagio() {
        return pedagio;
    }

    public void setPedagio(List<Pedagio> pedagio) {
        this.pedagio = pedagio;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }
}
