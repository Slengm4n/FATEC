package com.sistema.estacionamento.controller;

import com.sistema.estacionamento.model.Usuario;
import com.sistema.estacionamento.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios-html")
@RequiredArgsConstructor
public class UsuarioHtmlController {

    private final UsuarioRepository usuarioRepository;

    // CREATE
    @PostMapping("/salvar")
    public String salvarUsuario(
            @RequestParam String nomeUsuario,
            @RequestParam String email,
            @RequestParam String telefone
    ) {

        Usuario usuario = new Usuario();

        usuario.setNomeUsuario(nomeUsuario);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);

        usuarioRepository.save(usuario);

        return "redirect:/usuarios.html";
    }

    // READ
    @GetMapping("/buscar")
    @ResponseBody
    public Usuario buscarUsuario(@RequestParam Long id) {

        return usuarioRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Usuário não encontrado com id: " + id));
    }

    // UPDATE
    @PostMapping("/atualizar")
    public String atualizarUsuario(
            @RequestParam Long id,
            @RequestParam String nomeUsuario,
            @RequestParam String email,
            @RequestParam String telefone
    ) {

        Usuario usuario = new Usuario();

        usuario.setId(id);
        usuario.setNomeUsuario(nomeUsuario);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);

        usuarioRepository.save(usuario);

        return "redirect:/usuarios-crud.html";
    }

    // DELETE
    @PostMapping("/excluir")
    public String excluirUsuario(@RequestParam Long id) {

        usuarioRepository.deleteById(id);

        return "redirect:/usuarios-crud.html";
    }
}