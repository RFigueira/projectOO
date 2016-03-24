package br.com.codepampa.app;

import br.com.codepampa.model.ContaEspecial;
import br.com.codepampa.model.Pessoa;
import br.com.codepampa.model.Poupanca;
import br.com.codepampa.util.JavaUtil;

import java.util.Scanner;


public class appBank {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        ContaEspecial contaEspecial = new ContaEspecial();
        Poupanca poupanca = new Poupanca();


        mainMenu(teclado, pessoa, contaEspecial, poupanca);
        if(!JavaUtil.isNullOrEmpty(pessoa.getNome())){
            System.out.println(pessoa);
        }
    }

    public static void mainMenu(Scanner teclado, Pessoa pessoa, ContaEspecial contaEspecial,
                                Poupanca poupanca) {
        System.out.print("Olá seja bem-vindo ao digitaU! o que você deseja fazer?" +
                "\n 1 - Inserir Pessoa | 2 - Para inserir Conta poupança | 3 - Para inserir Conta especial");

        switch (teclado.nextInt()) {
            case 1:
                popularPessoa(teclado, pessoa);
                break;
            case 2:
                System.out.println("Case 2");
                popularContaPoupanca(teclado, poupanca, pessoa);
                break;
            case 3:
                System.out.println("Case 3");
                popularContaEspecial(teclado, contaEspecial, pessoa);
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

    public static void popularPessoa(Scanner teclado, Pessoa pessoa) {
        teclado.nextLine();
        System.out.println("Informe o nome do corretista....:");
        pessoa.setNome(teclado.nextLine());
        System.out.println("Informe a idade do sr(a) " + pessoa.getNome() + "....:");
        pessoa.setIdade(teclado.nextInt());
        System.out.println("Informe o numero do celular do sr(a) " + pessoa.getNome() + "....:");
        pessoa.setCelular(teclado.nextLong());
        System.out.println("Informe o email do sr(a) " + pessoa.getNome() + "....:");
        teclado.nextLine();
        pessoa.setEmail(teclado.nextLine());
    }

    public static void popularContaPoupanca(Scanner teclado, Poupanca poupanca, Pessoa pessoa) {
        if(JavaUtil.isNullOrEmpty(pessoa.getNome())){
            System.out.println("Malandrão primeiramente você precisa inserir um cliente!!!");
            return;
        }
    }

    public static void popularContaEspecial(Scanner teclado, ContaEspecial contaEspecial, Pessoa pessoa) {
        if(JavaUtil.isNullOrEmpty(pessoa.getNome())){
            System.out.println("Malandrão primeiramente você precisa inserir um cliente!!!");
            return;
        }
    }
}
