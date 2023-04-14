package com.adryan.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adryan.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
