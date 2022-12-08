package com.projeto.controller;

public class Agencia {

    private int agencia;
    private String gerente;

    public Agencia(int agencia, String gerente) {
        this.agencia = agencia;
        this.gerente = gerente;
    }



    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = String.valueOf(gerente);
    }
}
