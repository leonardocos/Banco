package entity;

import java.time.LocalDate;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titularConta, double saldo, LocalDate dataCriacao, String numeroConta) {
        super(titularConta, saldo, dataCriacao, numeroConta);
    }

    @Override
    public double sacar(String numeroConta, double valorSaque) {
        if()
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
