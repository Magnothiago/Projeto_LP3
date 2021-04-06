package com.example.systemtransporte.pacote.domain;

import com.example.systemtransporte.cliente.domain.Cliente;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;


@Entity
public class Pacote implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String descricao;
    private BigDecimal valor;
    @Column(unique = true, nullable = false)
    private String codigo;
    private double peso;
    private String origem;
    private String destino;

    @ManyToOne
    private Cliente cliente;

    public Pacote() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacote pacote = (Pacote) o;
        return id == pacote.id && Double.compare(pacote.peso, peso) == 0 && Objects.equals(descricao, pacote.descricao) && Objects.equals(valor, pacote.valor) && Objects.equals(codigo, pacote.codigo) && Objects.equals(origem, pacote.origem) && Objects.equals(destino, pacote.destino) && Objects.equals(cliente, pacote.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, valor, codigo, peso, origem, destino, cliente);
    }
}
