import java.util.*;
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>(Comparator.comparing(e -> e.name));
        employees.add(new Employee(1, "Bharath"));
        employees.add(new Employee(2, "Ajay"));
        employees.add(new Employee(3, "Damu"));
        System.out.println("Employees: " + employees);
    }
}