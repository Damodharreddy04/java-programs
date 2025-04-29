class Employee {
    public void calculateSalary() {
        System.out.println("Basic salary is calculated.");
    }
}

class Manager extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Manager's salary includes bonuses.");
    }
}

public class SalarySystem {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.calculateSalary();
        Employee manager = new Manager();
        manager.calculateSalary();
    }
}