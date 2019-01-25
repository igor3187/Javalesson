package com.company.lesson13;

import java.util.Objects;

public class User2 {
    private String login, password;


    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        User2 user = new User2("login", "password");
        user.createQuery("\"query1\"");

    }

    public void createQuery(String name) {
        class Query {
            public void printToLog() {
                System.out.printf("User with %s and %s send a query: %s.\n", login, password, name);
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User2)) return false;
        User2 user2 = (User2) o;
        return Objects.equals(getLogin(), user2.getLogin()) && Objects.equals(getPassword(), user2.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword());
    }

    @Override
    public String toString() {
        return "User2{" + "login='" + login + '\'' + ", password='" + password + '\'' + '}';
    }
}

