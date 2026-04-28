package com.crud.cliente.repository;
// Define o pacote onde está o Repository (camada de acesso ao banco)

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.cliente.entity.ClienteEntity;
// Importa a entidade ClienteEntity (tabela do banco)

@Repository
// Marca como um Bean do Spring (opcional quando usa JpaRepository, mas é boa prática)
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    // Essa interface herda automaticamente vários métodos prontos:

    // save() -> Salvar ou atualizar um cliente
    // findAll() -> Buscar todos os clientes
    // findById() -> Buscar por ID
    // deleteById() -> Deletar por ID
    // existsById() -> Verificar se existe

    // <ClienteEntity, Long> significa:
    // ClienteEntity -> tipo da entidade
    // Long -> tipo da chave primária (id)
}