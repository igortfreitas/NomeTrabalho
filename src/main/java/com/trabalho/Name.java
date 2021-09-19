package com.trabalho;

import javax.persistence.*;

@Entity()
public class Name {

    @Id
    protected String nome;

    public Name(String nome) {
        this.nome = corrigeNome(nome);
    }

    public Name() { }

    public String corrigeNome(String nome){
        String[] mudarNome = (nome.split(" "));
        int tamanho = (mudarNome.length) - 1;
        String n0 = mudarNome[tamanho];
        String n1 = (n0.toUpperCase() + "," + " ");
        return ((n1 + nome.substring(0, nome.indexOf(n0))).replaceAll("\s+", " "));
    }

    @Override
    public String toString() {
        return nome;
    }
}