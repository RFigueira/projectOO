package br.com.codepampa.app;



import java.util.Scanner;

public class appPessoa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        FakePessoa pessoa = new FakePessoa();
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

    public static void mostrarNaTela(FakePessoa pessoa){
        System.out.println("Nome..........: "+ pessoa.nome);
        System.out.println("Idade.........: "+ pessoa.idade);
        System.out.println("Celular.......: "+ pessoa.celular);
        System.out.println("e-mail........: "+ pessoa.email);

    }
}
