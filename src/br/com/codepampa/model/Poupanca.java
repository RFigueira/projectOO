package br.com.codepampa.model;


public class Poupanca extends Conta {

    public Poupanca() {
        super();
    }

    public Poupanca(int numero, Pessoa correntista, float saldo) {
        super(numero, correntista, saldo);
    }

    public void atualizarSaldo(float juros) {
        juros = this.saldo * (juros / 100);
        this.saldo += juros;
    }

    @Override
    public boolean sacar(float valor) {
        if (0 <= valor || valor > this.saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }
}
