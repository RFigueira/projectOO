package br.com.codepampa.model;


public class Pessoa {

    protected String nome;
    protected int idade;
    protected long celular;
    protected String email;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, long celular, String email) {
        this.nome = nome;
        this.idade = idade;
        this.celular = celular;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
