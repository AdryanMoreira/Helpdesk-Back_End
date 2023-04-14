package com.adryan.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adryan.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
