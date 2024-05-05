import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Worker pracownik1 = new Worker("James", 2000,1, "01.02.2023","Junior Programmer");
        Worker pracownik2 = new Worker("Martha", 3000, 2, "01.05.2023", "Senior Programer");
        Worker pracownik3 = new Worker("John", 2000, 2,"03.11.2022", "Senior Programmer");

        Manager manager1 = new Manager("Gregory", 4000,3,"01.05.2023", "Manager");

        System.out.println(pracownik1.getName() + " has code: " + pracownik1.hashCode());
        System.out.println(pracownik2.getName() + " has code: " + pracownik2.hashCode());
        System.out.println(pracownik3.getName() + " has code: " + pracownik3.hashCode());
        System.out.println(manager1.getName() + " has code: " + manager1.hashCode());

        System.out.println(pracownik2.getName() + " equals pracownik1: " + pracownik2.equals(pracownik1));
        System.out.println(pracownik2.getName() + " equals pracownik3: " + pracownik2.equals(pracownik3));
        System.out.println(pracownik2.getName() + " equals manager1: " + pracownik2.equals(manager1));








    }
}