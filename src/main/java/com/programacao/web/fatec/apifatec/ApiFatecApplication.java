package com.programacao.web.fatec.apifatec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacao.web.fatec.apifatec.domain.cliente.ClienteRepository;
import com.programacao.web.fatec.apifatec.entities.Clientes;


@RestController
@SpringBootApplication
public class ApiFatecApplication {
	
	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository clienteRepository) {
		return args -> {
			Clientes cliente = new Clientes();
			cliente.setNome("Danilo");
			cliente.setEmail("h2danilofatec@hotmail.com");
			cliente.setEndereco("Rua xxx, 126");
			cliente.setRazaoSocial("Danilo");
			
			clienteRepository.save(cliente);
		};
	}
	
	@RequestMapping("/")
	String home() {
		return "hello world";
	}
	
	@RequestMapping("/hello")
	String home2() {
		return "hello world 2";
	}
	
	@RequestMapping("/numero")
	Integer numero() {
		return 2;
	}
	
	@RequestMapping("/numero/{num}")
	Integer numero2(@PathVariable Integer num) {
		return num;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
	}

}
