package com.company.lesson8;

public class NewStudent {

    private String firstName,lastName;
    private int group;
    private double averageMark;

    public NewStudent(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public NewStudent() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        return getAverageMark()== 5 ? 100 : 80;
       /* if (getAverageMark()==5){
            return 100;
        }else {
            return 80;
        }*/
    }
}
