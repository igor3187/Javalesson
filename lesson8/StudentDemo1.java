package com.company.lesson8;

import com.company.lesson9.Student;

public class StudentDemo1 {


    public static void main(String[] args) {

        Student1 student1 = new Student1("Ivan", "Petrov", "group1", 4);
        Aspirant1 aspirant1 = new Aspirant1("Ivan Aspirant", "Petrov", "group1", 5, "sciencework");


        Student1 students[] = {student1, aspirant1};
        for (Student1 student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getScholarship());
        }
        System.out.println(student1.getFirstName() + ", " + student1.getLastName() + ", " + student1.getGroup() + ", " + student1.getAverageMark());
        System.out.println(aspirant1.getFirstName() + ", " + aspirant1.getLastName() + ", " + aspirant1.getGroup() + ", " + aspirant1.getAverageMark() + ", " + aspirant1.getScienceWork());

    }

}
