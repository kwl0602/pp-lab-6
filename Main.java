import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Michał", 50000, 1, "2021-01-10", "Księgowy");
        Worker w2 = new Worker("Aleksander", 52000, 1, "2020-03-15", "Inżynier");
        Worker w3 = new Worker("Aleksandra", 54000, 3, "2022-05-20", "Informatyk");
        Manager m1 = new Manager("Marcin", 100000, 5, "2019-08-01", "Dyrektor");

        List<Employee> employees = new ArrayList<>();
        employees.add(w1);
        employees.add(w2);
        employees.add(w3);
        employees.add(m1);

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " has code: " + emp.hashCode());
        }

        System.out.println("Comparing " + w2.getName() + " with other employees:");
        for (Employee emp : employees) {
            boolean isEqual = w2.equals(emp);
            System.out.println("Comparing to " + emp.getName() + ": " + isEqual);
        }
    }
}
