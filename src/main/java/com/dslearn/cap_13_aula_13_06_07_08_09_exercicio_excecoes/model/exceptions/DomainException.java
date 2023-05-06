package com.dslearn.cap_13_aula_13_06_07_08_09_exercicio_excecoes.model.exceptions;

public class DomainException extends Exception {
    private static final long serialVerionUID = 1L;

    public DomainException(String message) {
        super(message);
    }
}
