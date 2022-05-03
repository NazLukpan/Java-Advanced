package HW7;

public class Worker extends Employee{

    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    public double getSalary() {
        return getBaseSalary();
    }

    public Worker(String name, double dailyBaseSalary) {
        super(name, dailyBaseSalary);
    }
}
