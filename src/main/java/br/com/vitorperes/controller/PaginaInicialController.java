package br.com.vitorperes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaInicialController {

    @RequestMapping("/")

    public String paginaInicial(){
        return "teste uau";
    }
}
