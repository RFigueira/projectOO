package br.com.codepampa.model;

public abstract class Conta {

    protected int numero;
    protected Pessoa correntista;
    protected float saldo;
    public final int DEPOSITAR = 0;
    public final int SACAR = 1;
    private static int numeroContas;


    public Conta() {
        incrementarContas();
    }

    public Conta(int numero, Pessoa correntista, float saldo) {
        this();
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

    public static int getNumeroContas(){
        return numeroContas;
    }



    public final void depositar(float valor) {
        saldo += valor;
    }

    public abstract boolean sacar(float valor);

    public final boolean movimentar(float valor, int tipo) {
        if (tipo == DEPOSITAR) {
            this.depositar(valor);
        } else {
            return this.sacar(valor);
        }
        return true;
    }

    private static void incrementarContas(){
        ++numeroContas;
    }

}
