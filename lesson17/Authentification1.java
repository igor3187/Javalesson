package com.company.lesson17;

public class Authentification1 {
    public static void main(String[] args) {
        System.out.println(verifyCredit("login", "password", "password"));
        System.out.println(verifyCredit("loginnnnnnnnnn", "password", "password"));
        System.out.println(verifyCredit("login", "password", "pnnnnnnnnnnnnnnnnnassword"));
    }

    private static boolean verifyCredit(String login, String password, String confPass) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("логин больше 20");
            }
            if (password.length() > 20 || !password.equals(confPass)) {
                throw new WrongPasswordException("пароль больше 20");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.printf("%s %s %s\n ", login, password, confPass);
        }
        return true;
    }
}
