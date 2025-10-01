package br.unipar.devbackend.livrariaunipar.service;

import br.unipar.devbackend.livrariaunipar.model.Usuario;
import br.unipar.devbackend.livrariaunipar.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // avisa que é um serviço (camada de serviço onde tem as regras de negócio)
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario gravar(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public List<Usuario> findByNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public Usuario editar(Usuario usuario) {
        return repository.save(usuario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
