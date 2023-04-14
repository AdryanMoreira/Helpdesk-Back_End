package com.adryan.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adryan.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
