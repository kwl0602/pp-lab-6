import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Michał", 50000, 1);
        Worker w2 = new Worker("Aleksander", 52000, 2);
        Worker w3 = new Worker("Aleksandra", 54000, 3);
        Worker w4 = new Worker("Tymoteusz", 56000, 4);
        Manager m1 = new Manager("Marcin", 100000, 5);

        Employee[] employees = { w1, w2, w3, w4, m1 };
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " zarabia $" + emp.getSalary());
            emp.work();
        }
    }
}
