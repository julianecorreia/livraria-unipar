package br.unipar.devbackend.livrariaunipar.controller;

import br.unipar.devbackend.livrariaunipar.model.Usuario;
import br.unipar.devbackend.livrariaunipar.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // avisa que é um controlador (que vai receber as requisições)
@RequestMapping("/usuarios") // mapeamento da URL (endereço) que vai ser acessado
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping // mapeamento do método HTTP (POST)
    public ResponseEntity<Usuario> gravar(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = usuarioService.gravar(usuario);
        return ResponseEntity.ok(usuarioNovo);
    }

}
