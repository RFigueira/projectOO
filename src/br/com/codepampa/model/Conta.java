package br.com.codepampa.model;

public class Conta {

    protected int numero;
    protected Pessoa correntista;
    protected float saldo;

    public Conta() {
    }

    public Conta(int numero, Pessoa correntista, float saldo) {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }


    public void depositar(float valor) {
        saldo += valor;
    }

    public boolean sacar(float valor) {
        if(0 <= valor || valor > this.saldo){
            return false;
        }
        this.saldo -= valor;
        return true;
    }


}
