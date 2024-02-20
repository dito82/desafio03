package com.devsuperior.desafio03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desafio03.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	/*
	 * Realiza operações individuais de acesso ao banco de dados
	 */
}
