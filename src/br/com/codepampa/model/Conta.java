package br.com.codepampa.model;

public class Conta {

    private int codigo;
    private String correntista;
    private float saldo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void setCorrentista(String correntista) {
        this.correntista = correntista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public boolean sacar(float valor) {
        if(valor > saldo){
            return false;
        }
        saldo -= valor;
        return true;
    }


}
