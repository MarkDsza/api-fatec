package com.programacao.web.fatec.apifatec.domain.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacao.web.fatec.apifatec.entities.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Long> {

}

