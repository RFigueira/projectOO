package br.com.codepampa.app;

import br.com.codepampa.model.Conta;



public class appBank {

    private static String SALDO_INSUFICIENTE = "Ops, parece que seu saldo não permite esse saque.";
    private static String SAQUE_SUCESSO = "Saque realizado com sucesso!";

    public static void main(String[] args) {
        Conta conta = new Conta();
        if (conta != null) {

            conta.setCodigo(01);
            conta.setCorrentista("Rodrigo F.");
            conta.depositar(500.00F);

            if (conta.sacar(200.00F)) {
                mostrarNaTela(conta, true);
                System.out.println(SAQUE_SUCESSO);
            } else {
                mostrarNaTela(conta, false);
                System.out.println(SALDO_INSUFICIENTE);
            }

        } else {
            System.out.println("Ops, algo de estranho aconteceu!!!");
        }

    }

    public static void mostrarNaTela(Conta conta, boolean isSaque) {
        System.out.println("Conta Numero........: " + conta.getCodigo());
        System.out.println("Correntista.........: " + conta.getCorrentista());
        System.out.println("Saldo pre saque.....: " + conta.getSaldo());
        if (isSaque) {
            System.out.println("Saldo pos saque.....: " + conta.getSaldo());
        }
    }
}
