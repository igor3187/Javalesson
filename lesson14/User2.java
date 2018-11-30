package com.company.lesson14;


public class User2 {
    private static String login;
    private static String password;

    /*public String getLogin() {
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
    }*/

    static class Query{
        public void printToLOg(){
            System.out.println(login);
            System.out.println(password);
        }
    }

    public static void createQuery(){
        Query query = new Query();
        query.printToLOg();
    }

   /* public void createQuery() {

        class Query {

            public void printToLOg() {
                System.out.printf("User %s with password %s send a query.\n", login, password);
            }

            Query query = new Query();

        }
    }*/

    /*p*//*ublic User2(String login, String password) {

        this.login = login;
        this.password = password;
    }
*/
    public static void main(String[] args) {
       /* Use*//*r2 user = new User2("login1", "password1");
        User user1 = new User("login2", "password2");
        user.createQuery();

        User.Query query = user1.new Query();
        query.printToLOg();*/

        User2.Query query = new User2.Query();
        query.printToLOg();
        createQuery();
    }

}


