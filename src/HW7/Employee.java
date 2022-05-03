package HW7;

import HW72.Month;

public class Employee {
    private double baseSalary;
    private String name;
    private double dailyBaseSalary;

    public Employee(String name, double dailyBaseSalary) {
        this.name = name;
        this.dailyBaseSalary = dailyBaseSalary;
    }

    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }


    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailyBaseSalary() {
        return dailyBaseSalary;
    }

    public void setDailyBaseSalary(double dailyBaseSalary) {
        this.dailyBaseSalary = dailyBaseSalary;
    }

    public double getSalary(Month[] monthArray) {
        double allSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            allSalary += getDailyBaseSalary() * monthArray[i].getWorkDays();
        }
        return allSalary;
    }


}
