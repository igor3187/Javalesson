package com.company.lesson13;

import java.util.Objects;

public class User {
    private String login, password;

    public class Query {
        public void printToLog() {
            System.out.printf("User with %s and %s send a query.\n", login, password);
        }
    }

    public User(String login, String password) {
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
        User user = new User("login", "password");
        user.createQuery();
        User.Query query1 = user.new Query();
        query1.printToLog();
        User.Query query2 = new User("login1", "password1").new Query();
        query2.printToLog();
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getLogin(), user.getLogin()) && Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword());
    }

    @Override
    public String toString() {
        return "User{" + "login='" + login + '\'' + ", password='" + password + '\'' + '}';
    }
}
