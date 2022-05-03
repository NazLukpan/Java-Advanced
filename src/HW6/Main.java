package HW6;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tanya", 30, "F", 30000);
        Employee employee2 = new Employee("Daria", 35, "F", 50000);
        Employee employee3 = new Employee("Tanya", 30, "M", 52222);
        Employee[] employees = new Employee[]{employee1, employee2};
        //  employees[0].getName();
        System.out.println(employee1.isSameName(employee2));
        System.out.println(employee1.isSameName(employee3));
        System.out.println(employee1.getName());
        System.out.println(employee3.getName());

        System.out.println(Salary.getSum(employees));
    }
}
