package entity;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String titularConta, double saldo, LocalDate dataCriacao, String numeroConta) {
        super(titularConta, saldo, dataCriacao, numeroConta);
    }

    @Override
    public double sacar(String numeroConta, double valorSaqu) {
        return 0;
    }

    @Override
    public double transferir(String numeroContaDestino, double valorTransferencia) {
        return 0;
    }

    @Override
    public double depositar(String numeroConta, double valorDeposito) {
        return 0;
    }
}
