package com.company.lesson13;

import java.util.Objects;

public class User3 {
    private static String login, password;

    static class Query {
        void printToLog() {
            System.out.printf("User with %s and %s send a query: %s.\n", login, password);
        }
    }

    public static void initialize(String login, String password) {
        User3.login = login;
        User3.password = password;
    }

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    public static void setLogin(String login) {
        User3.login = login;
    }

    public static void setPassword(String password) {
        User3.password = password;
    }

    public static void main(String[] args) {
        initialize("login3", "password3");
        User3 user = new User3();
        createQuery("\"query1\"");
    }

    public static void createQuery(String name) {
        Query query = new Query();
        query.printToLog();

        User3.Query query1 = new User3.Query();
        query1.printToLog();

        Query query2 = new Query();
        query2.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User3)) return false;
        User3 user = (User3) o;
        return Objects.equals(getLogin(), user.getLogin()) && Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword());
    }

    @Override
    public String toString() {
        return "User3{}";
    }
}

