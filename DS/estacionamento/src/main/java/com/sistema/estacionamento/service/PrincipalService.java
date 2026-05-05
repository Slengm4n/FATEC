package com.sistema.estacionamento.service; // <-- Faltou essa linha antes!

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sistema.estacionamento.model.Principal;
import com.sistema.estacionamento.repository.PrincipalRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PrincipalService {

    private final PrincipalRepository principalRepository;

    public List<Principal> listarTodos() {
        return principalRepository.findAll();
    }

    public Principal buscarPorId(Long id) {
        return principalRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Principal não encontrado com id: " + id));
    }

    public Principal criar(Principal principal) {
        principal.setDataCadastro(LocalDate.now());
        return principalRepository.save(principal);
    }

    public Principal atualizar(Long id, Principal dados) {
        Principal existente = buscarPorId(id);
        
        existente.setNome(dados.getNome());
        existente.setDescricao(dados.getDescricao());
        
        return principalRepository.save(existente);
    }

    public void deletar(Long id) {
        buscarPorId(id);
        principalRepository.deleteById(id);
    }
}