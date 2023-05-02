package com.dslearn.cap_11_enumeracoes_e_composicao.aula_13_06_07_08_09_exercicio_excecoes.model.exceptions;

public class DomainException extends Exception {
    private static final long serialVerionUID = 1L;

    public DomainException(String message) {
        super(message);
    }
}
