package br.com.codepampa.model;


public final class ContaComum extends Conta {

    public ContaComum() {
        super();
    }

    public ContaComum(int numero, Pessoa correntista, float saldo) {
        super(numero, correntista, saldo);
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
