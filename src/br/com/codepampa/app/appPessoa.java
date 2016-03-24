package br.com.codepampa.app;



import br.com.codepampa.model.Pessoa;

import java.util.Scanner;

public class appPessoa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        if(pessoa!= null){
            System.out.println("Pessoa criada com sucesso!!!");

            System.out.println("Informe o nome.......:");

            System.out.println("Informe a idade......:");

            System.out.println("Informe o celular....:");

            System.out.println("Informe o e-mail......:");

            mostrarNaTela(pessoa);

        }else{
            System.out.println("Ops, algo de estranho aconteceu!!!");
        }

    }

    public static void mostrarNaTela(Pessoa pessoa){
        System.out.println("Nome..........: "+ pessoa.getNome());
        System.out.println("Idade.........: "+ pessoa.getIdade());
        System.out.println("Celular.......: "+ pessoa.getCelular());
        System.out.println("e-mail........: "+ pessoa.getEmail());

    }
}
