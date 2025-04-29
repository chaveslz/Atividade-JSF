package br.com.cadUser;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class Pessoa {
    private String nome;
    private static List<String> nomes = new ArrayList<>();

    public void adicionar() {
        if (nome != null && !nome.isEmpty()) {
            nomes.add(nome);
        }
        nome = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }
}