package model;

import java.util.Objects;

public class Site {
    private String nome;

    public Site(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
