package com.crud.cliente.controller;
// Define o pacote onde está o Controller (camada que recebe requisições HTTP)

import com.crud.cliente.entity.ClienteEntity;
// Importa a entidade ClienteEntity (representa os dados do cliente)

import com.crud.cliente.service.ClienteService;
// Importa o Service (onde fica a lógica do sistema)

import org.springframework.beans.factory.annotation.Autowired;
// Permite injeção automática de dependência (Spring cria o objeto pra você)

import org.springframework.web.bind.annotation.*;
// Importa todas as anotações REST (@GetMapping, @PostMapping, etc.)

import java.util.List;
// Importa lista (usada para retornar vários clientes)

@RestController
// Indica que essa classe é um controlador REST (retorna JSON automaticamente)

@RequestMapping("/api/clientes")
// Define a URL base da API -> tudo começa com /api/clientes
public class ClienteController {

    @Autowired
    // Injeta automaticamente o ClienteService (não precisa instanciar com new)
    private ClienteService service;

    // LISTAR TODOS
    @GetMapping
    // Mapeia requisição GET -> http://localhost:8080/api/clientes
    public List<ClienteEntity> listarTodos() {
        return service.listarTodos();
        // Chama o service e retorna todos os clientes do banco
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    // Mapeia GET com parâmetro -> /api/clientes/1
    public ClienteEntity buscarPorId(@PathVariable Long id) {
        // @PathVariable pega o valor da URL e joga na variável "id"
        return service.buscarPorId(id);
        // Busca cliente pelo ID
    }

    // CRIAR
    @PostMapping
    // Mapeia requisição POST -> criação de novo cliente
    public ClienteEntity salvar(@RequestBody ClienteEntity cliente) {
        // @RequestBody converte JSON -> objeto ClienteEntity
        return service.salvar(cliente);
        // Salva no banco e retorna o cliente salvo
    }

    // ATUALIZAR
    @PutMapping("/{id}")
    // Mapeia requisição PUT -> atualizar cliente existente
    public ClienteEntity atualizar(@PathVariable Long id, @RequestBody ClienteEntity cliente) {
        // Recebe ID pela URL e dados pelo corpo (JSON)
        return service.atualizar(id, cliente);
        // Atualiza os dados no banco
    }

    // DELETAR
    @DeleteMapping("/{id}")
    // Mapeia requisição DELETE -> remover cliente
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
        // Deleta o cliente pelo ID
    }
}