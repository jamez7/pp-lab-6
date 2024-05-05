import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Worker pracownik1 = new Worker("James", 2000,1, "01.02.2023","Junior Programmer");
        Worker pracownik2 = new Worker("Martha", 3000, 2, "01.05.2023", "Senior Programer");
        Worker pracownik3 = new Worker("John", 2000, 3,"03.11.2022", "Senior Programmer");
        Worker pracownik4 = new Worker("Bob", 2500, 4,"26.09.2021", "Senior Programmer");
        Worker pracownik5 = new Worker("Hubert", 3500, 5,"08.05.2019", "Very Senior Programmer");

        Manager manager1 = new Manager("Gregory", 4000,6,"01.05.2023", "Manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(pracownik1);
        employees.add(pracownik2);
        employees.add(pracownik3);
        employees.add(pracownik4);
        employees.add(pracownik5);
        employees.add(manager1);

        for(Employee employee : employees) {
            System.out.println("- " + employee.getName() + "(ID): " + employee.hashCode() + ", Position: " +employee.getPosition()
                    + ", Hire date:" + employee.getHireDate() + ", Salary: " +employee.getSalary() + ")");
            employee.work();
        }



    }
}