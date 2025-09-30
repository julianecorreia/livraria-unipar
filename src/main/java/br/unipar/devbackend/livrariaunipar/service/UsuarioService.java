package br.unipar.devbackend.livrariaunipar.service;

import br.unipar.devbackend.livrariaunipar.model.Usuario;
import br.unipar.devbackend.livrariaunipar.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service // avisa que é um serviço (camada de serviço onde tem as regras de negócio)
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario gravar(Usuario usuario) {
        return repository.save(usuario);
    }




}
