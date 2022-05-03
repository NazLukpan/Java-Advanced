package HW72;

import HW7.Employee;
import HW7.Manager;
import HW7.Utils;

public class Main {
    public static void main(String[] args) {
        System.out.println(MonthUtils.getAllMonth()[0].getMonthName());

        Employee Sergey = new Employee("Sergey", 10.0);
        Employee Tom = new Employee("Tom", 5.0);
        Employee Sara = new Employee("Sara", 1.0);


        Manager Tony = new Manager("Tony", 1.0, 3);
        Manager Sam = new Manager("Sam", 1.0, 2);
        Manager Nom = new Manager("Nom", 1.0, 5);

        Month[] month2 = {MonthUtils.getAllMonth()[0], MonthUtils.getAllMonth() [1]};

        System.out.println(Sergey.getSalary(month2));
        System.out.println(Sergey.getSalary(MonthUtils.getAllMonth()));

        System.out.println(Tony.getSalary(month2));

    }
}
