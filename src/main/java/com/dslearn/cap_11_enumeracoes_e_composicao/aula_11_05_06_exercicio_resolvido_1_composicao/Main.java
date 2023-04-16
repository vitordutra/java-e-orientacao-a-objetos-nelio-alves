package com.dslearn.cap_11_enumeracoes_e_composicao.aula_11_05_06_exercicio_resolvido_1_composicao;

import com.dslearn.cap_11_enumeracoes_e_composicao.aula_11_05_06_exercicio_resolvido_1_composicao.entities.Department;
import com.dslearn.cap_11_enumeracoes_e_composicao.aula_11_05_06_exercicio_resolvido_1_composicao.entities.HourContract;
import com.dslearn.cap_11_enumeracoes_e_composicao.aula_11_05_06_exercicio_resolvido_1_composicao.entities.Worker;
import com.dslearn.cap_11_enumeracoes_e_composicao.aula_11_05_06_exercicio_resolvido_1_composicao.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        /* With Input
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter the worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Name: ");
        Double baseSalary = sc.nextDouble();

        // Worker Instantiation
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        // Contract Data
        System.out.print("How many contracts does this worker have?");
        Integer numberOfContracts = sc.nextInt();

        for (Integer i = 1; i <= numberOfContracts; i++) {
            System.out.printf("Enter contract #%d data: %n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours)");
            Integer hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        Integer month = Integer.parseInt(monthAndYear.substring(0, 2));
        Integer year = Integer.parseInt(monthAndYear.substring(3));

        // Main Output
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
        */

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the department's name: ");
        String departmentName = "Design";
        System.out.println("Enter the worker data: ");
        System.out.print("Name: ");
        String workerName = "Alex";
        System.out.print("Level: ");
        String workerLevel = "MID_LEVEL";
        System.out.print("Base Salary: ");
        Double baseSalary = 1200.00;

        // Worker Instantiation
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        // Contract Data
        System.out.print("How many contracts does this worker have?");
        Integer numberOfContracts = 3;

        List<String> dateList = new ArrayList<>();
        dateList.add("20/08/2018");
        dateList.add("13/06/2018");
        dateList.add("25/08/2018");

        List<Double> numberOfHoursList = new ArrayList<>();
        numberOfHoursList.add(50.00);
        numberOfHoursList.add(30.00);
        numberOfHoursList.add(80.00);

        List<Integer> durationList = new ArrayList<>();
        durationList.add(20);
        durationList.add(18);
        durationList.add(10);


        for (Integer i = 1; i <= numberOfContracts; i++) {
            System.out.printf("Enter contract #%d data: %n", i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(dateList.get(i - 1));
            System.out.print("Value per hour: ");
            Double valuePerHour = numberOfHoursList.get(i - 1);
            System.out.print("Duration (hours): ");
            Integer hours = durationList.get(i - 1);

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = "08/2018";
        Integer month = Integer.parseInt(monthAndYear.substring(0, 2));
        Integer year = Integer.parseInt(monthAndYear.substring(3));

        // Main Output
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
    }
}