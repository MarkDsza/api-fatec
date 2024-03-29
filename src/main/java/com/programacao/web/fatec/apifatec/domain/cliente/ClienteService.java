package com.programacao.web.fatec.apifatec.domain.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programacao.web.fatec.apifatec.entities.Clientes;

@Service
	public class ClienteService {
		@Autowired
		private ClienteRepository clienteRepository;

		public List<Clientes> listarClientes() {
			return clienteRepository.findAll();
		}

		public Clientes encontrarClientePorId(Long id) {
			return clienteRepository.findById(id).orElse(null);
		}

		public Clientes salvarCliente(Clientes cliente) {
			return clienteRepository.save(cliente);
		}

		public void deletarCliente(Long id) {
			clienteRepository.deleteById(id);
		}
	}


