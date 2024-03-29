// JDK Oracle OpenJDK 17
package br.com.empresa_funcionarios.classes;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, String dataNascimento, String salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = new BigDecimal(salario.replace(",", "."));
        this.funcao = funcao;
    }

    public Funcionario(String nome, String dataNascimento) {
        super(nome, dataNascimento);
    }

    public void aplicarAumento(BigDecimal percentual) {
        this.salario = this.salario.multiply(BigDecimal.ONE.add(percentual));
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getFuncao() {
        return funcao;
    }

    @Override
    public String toString() {
        return
                "nome= " + nome +
                ", Data de nascimento= " + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", Salário= " + DecimalFormat.getCurrencyInstance().format(salario) +
                ", Função= " + funcao;
    }
}
