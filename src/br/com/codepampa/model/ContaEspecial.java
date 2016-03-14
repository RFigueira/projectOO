package br.com.codepampa.model;


public class ContaEspecial extends Conta {
    private float limite;

    public ContaEspecial(int codigo, Pessoa correntista, float saldo, float limite) {
        super(codigo, correntista, saldo);
        this.limite = limite;
    }

    public ContaEspecial(){
        super();
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    public float getLimite(){
        return this.limite;
    }

    @Override
    public boolean sacar(float valor){
        if(this.saldo - valor <= this.limite){
            return false;
        }
        this.saldo -= valor;
        return true;
    }

}
