package HW7;

import HW72.Month;

public class Manager extends Worker {

    private int numberOfSubordinates;
    public Manager(String name, double dailyBaseSalary, int numberOfSubordinates) {
        super(name, dailyBaseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }


    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 3);
        }
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double allSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            allSalary += getDailyBaseSalary() * monthArray[i].getWorkDays()
                    + (getDailyBaseSalary() * monthArray[i].getWorkDays() * (getNumberOfSubordinates() * 100.0));
        }
        return allSalary;
    }

}


