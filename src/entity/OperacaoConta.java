package entity;

public interface OperacaoConta {

    double sacar(String numeroConta, double valorSaque);

    double transferir(String numeroContaDestino, double valorTransferencia);

    double depositar(String numeroConta, double valorDeposito);
}
