import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Michał", 50000, 1, "2021-01-10", "Księgowy");
        Worker w2 = new Worker("Aleksander", 52000, 1, "2020-03-15", "Informatyk");
        Worker w3 = new Worker("Aleksandra", 54000, 3, "2022-05-20", "Teleinformatyk");
        Manager m1 = new Manager("Marcin", 100000, 5, "2019-08-01", "Dyrektor");

        Worker w4 = new Worker("Mateusz", 57000, 3, "2023-04-01", "Inżynier");
        Manager m2 = new Manager("Franek", 102000, 5, "2018-07-15", "Dyrektor");

        List<Employee> employees = new ArrayList<>();
        employees.add(w1);
        employees.add(w2);
        employees.add(w3);
        employees.add(m1);
        employees.add(w4);
        employees.add(m2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;
        Map<Integer, Integer> idCount = new HashMap<>();

        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }

            idCount.put(emp.getId(), idCount.getOrDefault(emp.getId(), 0) + 1);
        }

        System.out.println("Zsumowane wypłat wszystkich w firmie: $" + totalSalary);
        System.out.println("Zsumowanie wypłat wszystkich Dyrektorów: $" + totalManagerSalary);
        System.out.println("Zsumowanie wypłat wszystkich pracowników: $" + totalWorkerSalary);

        System.out.println("Znalezione zdublikowane ID w kolekcji:");
        idCount.forEach((id, count) -> {
            if (count > 1) {
                System.out.println("ID " + id + " występuje " + count + " razy.");
            }
        });
    }
}
