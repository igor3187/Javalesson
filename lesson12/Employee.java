package com.company.lesson12;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String fullName;
    private double salary;
    static LocalDate salaryDate = LocalDate.now();

    public Employee(String fullName, double salary, LocalDate salaryDate) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(LocalDate salaryDate) {
        this.salaryDate = salaryDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getSalary(), getSalary()) == 0 && Objects.equals(getFullName(), employee.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" + "fullName='" + fullName + '\'' + ", salary=" + salary + '}';
    }
}