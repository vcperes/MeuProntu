package br.com.vitorperes.controller;

import br.com.vitorperes.models.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PessoaController {

    @RequestMapping("/pessoas")
    public List<Pessoa> listaPessoas(){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(1);
        pessoa.setNome("Vitor");
        pessoa.setSobrenome("Peres");
        return Arrays.asList(pessoa, pessoa);
    }
}
