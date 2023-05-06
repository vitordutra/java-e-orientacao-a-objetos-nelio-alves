package com.dslearn.cap_15_aula_03_04_05_06_interfaces.model.services;

import com.dslearn.cap_15_aula_03_04_05_06_interfaces.model.entities.CarRental;
import com.dslearn.cap_15_aula_03_04_05_06_interfaces.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        double HOURS_IN_DAY = 24.0;

        double durationOfRentalInMinutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double durationOfRentalInHours = durationOfRentalInMinutes / 60.0;
        double basicPayment;

        if (durationOfRentalInHours <= 12) {
            basicPayment = pricePerHour * Math.ceil(durationOfRentalInHours);
        } else {
            basicPayment = pricePerDay * Math.ceil(durationOfRentalInHours / HOURS_IN_DAY);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
