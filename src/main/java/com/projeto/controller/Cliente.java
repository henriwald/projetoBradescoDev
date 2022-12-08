package com.projeto.controller;

public class Cliente {

    private String nome;
    private String CPF;
    private int agencia;
    private int conta;
    private Gerente gerente;


    public Cliente(String nome, String CPF, int agencia, int conta, Gerente gerente) {
        this.nome = nome;
        this.CPF = CPF;
        this.agencia = agencia;
        this.conta = conta;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }


}
