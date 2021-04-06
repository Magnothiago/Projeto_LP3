package com.example.systemtransporte;

import com.example.systemtransporte.cliente.domain.Cliente;
import com.example.systemtransporte.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SystemtransporteApplication {

	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(SystemtransporteApplication.class, args);

	}

	@Bean
	InitializingBean sendDatabase() {
		Cliente cliente = new Cliente();
		cliente.setPrimeiroNome("Lucas");
		cliente.setDataNascimento(LocalDate.now());
		cliente.setDdd("98");
		cliente.setEmail("email@gmail.com");
		cliente.setNumeroTelefone("321654987");
		cliente.setCpf("250.391.470-58");
		cliente.setDataNascimento(LocalDate.now());
		cliente.setUltimoNome("Silva");
		clienteRepository.save(cliente);

		return null;

}
}