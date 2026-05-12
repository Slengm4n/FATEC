package com.sistema.estacionamento.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sistema.estacionamento.model.Registro;
import com.sistema.estacionamento.repository.RegistroRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistroService {

    private final RegistroRepository registroRepository;

    public List<Registro> listarTodos() {
        return registroRepository.findAll();
    }

    public Registro buscarPorId(Long id) {
        return registroRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Registro não encontrado com id: " + id));
    }

    public Registro criar(Registro registro) {
        registro.setDataRegistro(LocalDateTime.now());
        return registroRepository.save(registro);
    }

    public Registro atualizar(Long id, Registro dadosNovos) {
        Registro registro = buscarPorId(id);
        registro.setStatus(dadosNovos.getStatus());
        registro.setUsuario(dadosNovos.getUsuario());
        return registroRepository.save(registro);
    }

    public void deletar(Long id) {
        buscarPorId(id);
        registroRepository.deleteById(id);
    }

}