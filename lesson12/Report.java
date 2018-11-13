package com.company.lesson12;

import static com.company.lesson12.Employee.salaryDate;

public class Report {
    public static void main(String[] args) {
        Employee employee = new Employee("John Smith", 550.50, salaryDate);
        Employee employee1 = new Employee("Bob Sub", 652.30, salaryDate);
        Employee employee2 = new Employee("David Vendetta", 777.77, salaryDate);

        Employee[] employees = {employee, employee1, employee2};

        generateReport(employees);
        System.out.println("Date of next employee is: " + salaryDate.plusMonths(1));

    }

    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
