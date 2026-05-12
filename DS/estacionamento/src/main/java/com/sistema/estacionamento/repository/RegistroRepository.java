package com.sistema.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.estacionamento.model.Registro;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {

}
