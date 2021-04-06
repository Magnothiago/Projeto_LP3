package com.example.systemtransporte.cliente.repository;

import com.example.systemtransporte.cliente.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
