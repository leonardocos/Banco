package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

abstract class Conta implements OperacaoConta {
    private String titularConta;
    private double saldo;
    LocalDate dataCriacao;
    private String numeroConta;
    public static List<Conta> contas = new ArrayList<>();

    public Conta(String titularConta, double saldo, LocalDate dataCriacao, String numeroConta) {
        this.titularConta = titularConta;
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
        this.numeroConta = numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public buscarConta(String numeroConta){
        return conta;
    }

    public void salvarConta(){
        contas.add(this);
    }


}
