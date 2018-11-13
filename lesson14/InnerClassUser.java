package com.company.lesson14;

import java.util.Objects;

public class InnerClassUser {

    private String login, password;

    class Query {
        public void printToLog() {
            System.out.printf("User with login %s and password %s send an query.\n", login, password);
        }
    }

    public InnerClassUser(String login, String password) {

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

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InnerClassUser)) return false;
        InnerClassUser that = (InnerClassUser) o;
        return Objects.equals(getLogin(), that.getLogin()) && Objects.equals(getPassword(), that.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword());
    }

    @Override
    public String toString() {
        return "InnerClassUser{" + "login='" + login + '\'' + ", password='" + password + '\'' + '}';
    }

    public static void main(String[] args) {
        User user = new User("ThisIsLogin", "ThisIsPassword");
        user.createQuery();

        User.Query query = user.new Query();
        query.printToLOg();

        User.Query query1 = new User("ThisIsLogin1", "ThisIsPassword1").new Query();
        query1.printToLOg();
    }
}
