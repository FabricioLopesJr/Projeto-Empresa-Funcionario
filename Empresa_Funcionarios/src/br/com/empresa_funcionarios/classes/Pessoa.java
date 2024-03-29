// JDK Oracle OpenJDK 17
package br.com.empresa_funcionarios.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Pessoa {
    public String nome;
    public LocalDate dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

}