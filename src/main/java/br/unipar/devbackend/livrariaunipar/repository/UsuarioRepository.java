package br.unipar.devbackend.livrariaunipar.repository;

import br.unipar.devbackend.livrariaunipar.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // avisa que é um repositório (que vai fazer a persistência no banco de dados)
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findByNomeContainingIgnoreCase(String nome);
}
