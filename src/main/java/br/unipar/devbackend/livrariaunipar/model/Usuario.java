package br.unipar.devbackend.livrariaunipar.model;

import jakarta.persistence.*;

@Entity // que ela vai persistir no banco de dados
public class Usuario {

    @Id // avisa que é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // vai gerar automático o id (problema do banco de dados)
    private Long id;

    @Column(name = "nome") // mapeamento da coluna (opcional)
    private String nome;

    @Column(name = "login")
    private String login;

    public Usuario(Long id, String nome, String login) {
        this.id = id;
        this.nome = nome;
        this.login = login;
    }

    public Usuario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
