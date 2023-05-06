package com.dslearn.cap_15_aula_03_04_05_06_interfaces.model.services;

public class BrazilTaxService {

    public Double tax(Double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        } else {
            return amount * 0.15;
        }
    }
}
