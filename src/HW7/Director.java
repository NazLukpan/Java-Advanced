package HW7;

public class Director extends Manager {

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() + getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9);
        }
    }


}
