package br.com.letheia.ufology.FuncionalidadesCapitulo2;

import java.time.LocalDateTime;
public class Observador {;

    private int id;
    private String nome;
    private LocalDateTime nascimento;
    private Long documento;
    private String email;

    Observador(int id, String nome, LocalDateTime nascimento, Long documento, String email){

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do observador não pode ser vazio ou nulo.");
        }

        if (documento == null || documento <= 0) {
            throw new IllegalArgumentException("O documento fornecido é inválido.");
        }

        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("O e-mail fornecido é inválido.");
        }

        if (id <= 0) {
            throw new IllegalArgumentException("O ID deve ser maior que zero.");
        }

        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.documento = documento;
        this.email = email;
    }
}
