package com.sistema.estacionamento.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sistema.estacionamento.model.Usuario;
import com.sistema.estacionamento.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado com id: " + id));
    }

    public Usuario criar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(Long id, Usuario dadosNovos) {
        Usuario usuario = buscarPorId(id);
        usuario.setNomeUsuario(dadosNovos.getNomeUsuario());
        usuario.setEmail(dadosNovos.getEmail());
        usuario.setTelefone(dadosNovos.getTelefone());
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id) {
        buscarPorId(id);
        usuarioRepository.deleteById(id);
    }

}