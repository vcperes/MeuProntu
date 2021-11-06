package br.com.vitorperes.models;

public class Paciente {

    private int id;
    private String nome;
    private String sobrenome;

    public Paciente(int id, String nome, String sobrenome){
        this.id = id; this.nome = nome; this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
