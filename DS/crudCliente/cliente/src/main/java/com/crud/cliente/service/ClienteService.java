package com.crud.cliente.service;
// Define o pacote da camada de serviço (onde fica a lógica do sistema)

import com.crud.cliente.entity.ClienteEntity;
// Importa a entidade ClienteEntity (modelo da tabela)

import com.crud.cliente.repository.ClienteRepository;
// Importa o Repository (acesso ao banco de dados)

import org.springframework.beans.factory.annotation.Autowired;
// Permite injeção automática de dependência

import org.springframework.stereotype.Service;
// Indica que essa classe é um componente de serviço (regra de negócio)

import java.util.List;
// Importa lista (para retornar vários clientes)

@Service
// Marca a classe como Service (Spring gerencia automaticamente)
public class ClienteService {

    @Autowired
    // Injeta automaticamente o ClienteRepository (sem precisar usar "new")
    private ClienteRepository repository;

    // LISTAR TODOS
    public List<ClienteEntity> listarTodos() {
        return repository.findAll();
        // Busca todos os clientes no banco
    }

    // BUSCAR POR ID
    public ClienteEntity buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        // Tenta buscar pelo ID
        // Se não encontrar, lança erro (evita retornar null)
    }

    // SALVAR
    public ClienteEntity salvar(ClienteEntity cliente) {
        return repository.save(cliente);
        // Salva um novo cliente no banco
        // Se o ID for null -> INSERT
        // Se tiver ID -> UPDATE
    }

    // ATUALIZAR
    public ClienteEntity atualizar(Long id, ClienteEntity cliente) {

        ClienteEntity existente = buscarPorId(id);
        // Primeiro busca o cliente existente no banco

        existente.setNome(cliente.getNome());
        existente.setSobrenome(cliente.getSobrenome());
        existente.setEmail(cliente.getEmail());
        existente.setTelefone(cliente.getTelefone());
        existente.setCpf(cliente.getCpf());
        existente.setEndereco(cliente.getEndereco());
        existente.setCidade(cliente.getCidade());
        existente.setEstado(cliente.getEstado());
        existente.setCep(cliente.getCep());
        // Atualiza campo por campo (boa prática para evitar sobrescrever dados errados)

        return repository.save(existente);
        // Salva o objeto atualizado no banco
    }

    // DELETAR
    public void deletar(Long id) {
        repository.deleteById(id);
        // Deleta o cliente pelo ID
    }
}