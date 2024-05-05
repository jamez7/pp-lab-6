import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {

        Worker pracownik1 = new Worker("James", 2000,1);
        Worker pracownik2 = new Worker("Martha", 3000, 2 );
        Worker pracownik3 = new Worker("John", 2000, 3);
        Worker pracownik4 = new Worker("Bob", 2500, 4);
        Worker pracownik5 = new Worker("Hubert", 3500, 5);

        Manager manager1 = new Manager("Gregory", 4000,6);

        System.out.println(pracownik1.getSalary());
        pracownik1.work();
        System.out.println(pracownik2.getSalary());
        pracownik2.work();
        System.out.println(pracownik3.getSalary());
        pracownik3.work();
        System.out.println(pracownik4.getSalary());
        pracownik4.work();
        System.out.println(pracownik5.getSalary());
        pracownik5.work();
        System.out.println(manager1.getSalary());
        manager1.work();


    }
}