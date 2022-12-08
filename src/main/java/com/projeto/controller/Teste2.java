package com.projeto.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Teste2 {

    @RequestMapping("/v1")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Teste2.class, args);
    }

    @RequestMapping("/agendar")
    @ResponseBody
    protected String agendar() {
        Agendamento agendamento = new Agendamento(1, 3);
        agendamento.setAgenda(agendamento.agenda);
        agendamento.agendar();
        System.out.println(agendamento.agenda);




        return "agendado";}

}

