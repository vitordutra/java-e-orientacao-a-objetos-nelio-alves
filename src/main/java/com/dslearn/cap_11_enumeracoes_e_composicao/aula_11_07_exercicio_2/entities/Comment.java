package com.dslearn.cap_11_enumeracoes_e_composicao.aula_11_07_exercicio_2.entities;

public class Comment {
    private String text;

    public Comment() {
    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
