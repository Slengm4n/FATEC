package com.crud.cliente.model;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;

@Data

@Entity

@Table (name="cliente")
public class ClienteModel {

  @Id
  @GeneratedValue (strategy= GenerationType.IDENTITY)
  private Long id;

  @Column(nullable=false)
  private String nome;

  private String sobrenome;

  @Column(unique=true,nullable=false)
  private String email;

  private String telefone;

  @Column(unique=  true)
  private String cpf;

  private String endereco;
  private String cidade;
  private String estado;
  private String cep;

  private LocalDateTime dataCadastro;

  @PrePersist
  public void PrePersist(){
    this.dataCadastro = LocalDateTime.now();
  }

}
