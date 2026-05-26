package com.sistema.estacionamento.controller;

import com.sistema.estacionamento.model.Usuario;
import com.sistema.estacionamento.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios-html")
@RequiredArgsConstructor
public class UsuarioHtmlController {

    private final UsuarioRepository usuarioRepository;

    // READ - listar todos
    @GetMapping("/listar")
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    // CREATE
    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // UPDATE
    @PutMapping("/atualizar/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario dados) {
        Usuario usuario = usuarioRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuario.setNomeUsuario(dados.getNomeUsuario());
        usuario.setEmail(dados.getEmail());
        usuario.setTelefone(dados.getTelefone());
        return usuarioRepository.save(usuario);
    }

    // DELETE
    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}