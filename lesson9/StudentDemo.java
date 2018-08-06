package com.company.lesson9;

public class StudentDemo {
    public static void main(String[] args) {

        Student s = new Aspirant("Ivan", "Petrov", "group:1", 4.5, "My work");
        System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getGroup() + " " + s.getAverageMark());

        Aspirant a = new Aspirant("Pavel", "Login", "group:2", 5, "M");
        System.out.println(a.getFirstName() + " " + a.getLastName() + " " + a.getGroup() + " " + a.getAverageMark() + " " + a.getCienceWork());
        Student students[] = {s, a};
        for (Student student : students) {

            System.out.println(student.getFirstName()+" "+ student.getLastName() +" "+ student.getScholarship());

        }

    }

}
