package br.com.vitorperes.controller;

import br.com.vitorperes.models.Paciente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PacienteController {

    @RequestMapping("/pacientes")
    public List<Paciente> listaPessoas(){
        Paciente paciente = new Paciente(1, "Vitor", "Peres");
        return Arrays.asList(paciente, paciente);
    }
}
