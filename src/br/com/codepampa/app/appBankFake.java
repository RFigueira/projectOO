package br.com.codepampa.app;

import br.com.codepampa.model.Conta;
import br.com.codepampa.model.ContaEspecial;
import br.com.codepampa.model.Pessoa;
import br.com.codepampa.model.Poupanca;
import br.com.codepampa.util.JavaUtil;

import java.util.Scanner;


public class appBankFake {


    public static void main(String[] args) {

        ContaEspecial especial1, especial2, especial3;
        Pessoa pessoa = new Pessoa("Fulano", 26,99999,"fulano@gmail.com");

        especial1 = new ContaEspecial(234,pessoa, 1555F, 800F);
        System.out.println("numero contas criadas " + Conta.getNumeroContas());

        especial2 = new ContaEspecial();
        System.out.println("numero contas criadas " + Conta.getNumeroContas());

        especial3 = new ContaEspecial();
        System.out.println("numero contas criadas " + Conta.getNumeroContas());

   }


}
