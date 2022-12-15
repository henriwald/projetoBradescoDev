package com.projeto.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/consultaagenda")
    @ResponseBody
    protected String agenda() {
       Agendamento agendamento = new Agendamento(1, 3);
        agendamento.setAgenda(agendamento.agenda);
        agendamento.agendar();
    return "Selecione um horario: \n\n"
        + " 1 - 10h00\n"
        + " 2 - 10h30\n"
        + " 3 - 11h00\n"
        + " 4 - 11h30\n"
        + " 5 - 12h00\n"
        + " 6 - 12h30\n"
        + " 7 - 13h00\n"
        + " 8 - 13h30\n"
        + " 9 - 14h00\n"
        + "10 - 14h30\n"
        + "11 - 15h00\n"
        + "12 - 15h30\n\n";
    }

    @PostMapping("/realizaragenda")
    @ResponseBody
    protected String confirmaAgendamento(){
    System.out.println("teste" + agenda());
        return "Agendamento confirmado!";
    }


}

