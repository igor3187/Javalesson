package com.company.lesson8.secondLesson8;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public Aspirant(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public Aspirant() {
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public static void main(String[] args) {
        Student student = new Student("Petya", "Petrov", 1, 4.0);
        Aspirant aspirant = new Aspirant("Vova", "Ivanov", 2, 5.0, "\"scienceWork\"");
        Student aspirant1 = new Aspirant("Saha", "Popov", 2, 3.0, "\"scienceWork\"");

        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + ", average mark:" + student.getAverageMark() + ", group:" + student.getGroup());
        System.out.println("Student: " + aspirant.getFirstName() + " " + aspirant.getLastName() + ", group:" + aspirant.getGroup() + ", science work:" + aspirant.getScienceWork() + ", average mark:" + aspirant.getAverageMark());
        System.out.println("Student: " + aspirant1.getFirstName() + " " + aspirant1.getLastName() + ", group:" + aspirant1.getGroup() + ", science work:" + ((Aspirant) aspirant1).getScienceWork() + ", average mark:" + aspirant1.getAverageMark());

        Student[] students = {student, aspirant, aspirant1};

        for (Student s : students) {
            System.out.println(s.getLastName() + " " + s.getScholarship());
        }
    }

    public int getScholarship() {
        return getAverageMark() == 5 ? 200 : 100;
    }
}
