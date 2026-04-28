package com.crud.cliente.entity;
// Define o pacote onde está a entidade (modelo do banco de dados)

import jakarta.persistence.*;
// Importa as anotações do JPA (usadas para mapear a classe para tabela)

import lombok.Data;
// Lombok: cria automaticamente getters, setters, toString, equals, hashCode

import java.time.LocalDateTime;
// Importa o tipo de dado para data e hora

@Data
// Gera automaticamente:
// get(), set(), toString(), equals(), hashCode()
@Entity
// Indica que essa classe representa uma tabela no banco de dados
@Table(name = "tbl_cliente")
// Define o nome da tabela no banco (tbl_cliente)
public class ClienteEntity {

    @Id
    // Define que esse campo é a chave primária (PRIMARY KEY)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Define auto incremento (o banco gera o ID automaticamente)
    private Long id;

    @Column(nullable = false)
    // Campo obrigatório (não pode ser nulo no banco)
    private String nome;

    private String sobrenome;
    // Campo opcional (pode ser nulo)

    @Column(unique = true, nullable = false)
    // Campo obrigatório e único (não pode repetir no banco)
    private String email;

    private String telefone;
    // Campo opcional

    @Column(unique = true)
    // Campo único (não pode repetir, mas pode ser nulo)
    private String cpf;

    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    // Campos simples (mapeados automaticamente como colunas)

    private LocalDateTime dataCadastro;
    // Campo para armazenar data e hora do cadastro

    @PrePersist
    // Método executado automaticamente ANTES de salvar no banco
    public void prePersist() {
        this.dataCadastro = LocalDateTime.now();
        // Preenche automaticamente com a data/hora atual
    }
}