package com.company.lesson14;

public class User {
    private String login;
    private String password;

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
        query.printToLOg();


    }

    public User(String login, String password) {

        this.login = login;
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User("login1", "password1");
        User user1 = new User("login2", "password2");
        user.createQuery();

        User.Query query = user1.new Query();
        query.printToLOg();
    }

     class Query {
        public void printToLOg() {
            System.out.printf("User %s with password %s send a query.\n",login,password);
        }
    }

}
