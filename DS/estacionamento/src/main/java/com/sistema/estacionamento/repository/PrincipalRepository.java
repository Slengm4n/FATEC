package com.sistema.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.estacionamento.model.Principal;

@Repository
public interface PrincipalRepository extends JpaRepository<Principal, Long> {
}
