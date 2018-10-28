package com.company.lesson8;

public class NewAspirant extends NewStudent {

    String scienceWork;

    public NewAspirant(String firstName, String lastName, int group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public NewAspirant(String vanya, String pupkin, String s, double averageMark, String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        return getAverageMark() == 5 ? 200 : 180;
    }

    public static void main(String[] args) {
        NewStudent student1 = new NewStudent("Petya", "Petrov", 9, 5);
        NewAspirant aspirant1 = new NewAspirant("Vanya", "Pupkin", 12, 5, "Science");
        NewStudent aspirant2 = new NewAspirant("Vova", "Volkov", 4, 3.5, "ScienceOne");

        NewStudent[] students = {student1, aspirant1, aspirant2};
        for (NewStudent s : students) {
            System.out.println(s.getLastName() + " " + s.getScholarship());
        }

        System.out.println(student1.getFirstName());
        System.out.println(aspirant1.getLastName());
        System.out.println(aspirant2.getLastName());
    }
}
