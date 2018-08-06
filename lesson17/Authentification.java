package com.company.lesson17;

public class Authentification {
    public static void main(String[] args) throws WrongPasswordException, WrongLoginException {
        {
            System.out.println(
                    isCorrect("login1", "password1", "password1"));
            System.out.println(
                    isCorrect("lololololololololssssssssssssssssso", "password1", "password1"));
            System.out.println(
                    isCorrect("login1", "passrrrrrrrrrrrrrrrrrrrrrrrrrrrrrword1", "password1"));

        }
    }

    public static boolean isCorrect(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Wrong login");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Wrong password");
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("login: " + login);
            System.out.println("password: " + password);
            System.out.println("cofirm password: " + confPassword);
        }
        //  } catch (WrongPasswordException e) {
        //     System.out.println(e.getMessage());
        //     return false;

        return true;
}
}
