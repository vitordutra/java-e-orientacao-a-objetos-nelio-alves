package com.dslearn.cap_11_enumeracoes_e_composicao.aula_11_05_06_exercicio_resolvido_1_composicao.entities;

import com.dslearn.cap_11_enumeracoes_e_composicao.aula_11_05_06_exercicio_resolvido_1_composicao.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    // Não inserir no construtor qualquer atributo que seja uma lista
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month) {
        Double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();

        for (HourContract c : contracts) {
            calendar.setTime(c.getDate());
            Integer contractYear = calendar.get(Calendar.YEAR);
            Integer contractMonth = 1 + calendar.get(Calendar.MONTH);
            if (Objects.equals(year, contractYear) && Objects.equals(month, contractMonth)) {
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
