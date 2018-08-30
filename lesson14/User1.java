package com.company.lesson14;

public class User1 {
    static String login;
    static String password;

    public User1(String login, String password) {
        this.login = login;
        this.password = password;
    }

    static class Query {

        public static void printToLog() {
            System.out.printf("User %s with password %s send a query.\n", login, password);

        }
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        User1.login = login;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User1.password = password;
    }

    public static void main(String[] args) {
        Query query = new Query();
        query.printToLog();

    }

}