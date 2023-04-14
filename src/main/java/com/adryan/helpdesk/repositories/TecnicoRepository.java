package com.adryan.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adryan.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
