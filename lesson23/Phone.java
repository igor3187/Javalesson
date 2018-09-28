package com.company.lesson23;

public class Phone {
    private int id, user_id;
    private String number;

    @Override
    public String toString() {
        return "Phone{" + "id=" + id + ", user_id=" + user_id + ", number='" + number + '\'' + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Phone(int id, int user_id, String number) {
        this.id = id;
        this.user_id = user_id;
        this.number = number;
    }
}
