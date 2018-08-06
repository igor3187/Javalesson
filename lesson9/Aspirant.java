package com.company.lesson9;

public class Aspirant extends Student {
    private String cienceWork;


    public Aspirant(String firstName, String lastName, String group, double averageMark, String cienceWork) {
        super(firstName, lastName, group, averageMark);
        this.cienceWork = cienceWork;

    }

    public String getCienceWork() {
        return cienceWork;
    }

    public void setCienceWork(String cienceWork) {
        this.cienceWork = cienceWork;
    }

    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 100;
        } else {
            return 80;
        }
    }

}
