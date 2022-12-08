package com.projeto.controller;

import java.util.*;

public class Agendamento {

    private Cliente cliente;
    private int agencia;
    private int horario; // de 0 a 11

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Agendamento(int agencia, int horario) {
        this.agencia = agencia;
        this.horario = horario;
    }

    List<Integer> agenda = new ArrayList<Integer>(12);

    public List<Integer> getAgenda() {
        return agenda;
    }

    {
        int i = 0;
        while (i < 11){
            agenda.add(0, i);
            i++;
        }
    }

  public void agendar() {
    for (horario = 0; horario < 12; horario++) {
      if (horario == 0) {
        agenda.add(horario);
        System.out.println("Horário livre " + agenda);
      }
    }
    }

    public void agendar2(){
        agenda.add(horario, 12);
        System.out.println("Horário livre2: " + horario);

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public void setAgenda(List<Integer> agenda) {
        this.agenda = agenda;
    }
}
