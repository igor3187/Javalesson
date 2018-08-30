package com.company.lesson17;

public class Authenticate {
    public static void main(String[] args) {

        System.out.println(isCorrect("login", "password", "password"));
        System.out.println(isCorrect("loginefvdevdfbv", "password", "pafbrbrbrbssword"));
        System.out.println(isCorrect("login", "password", "password"));
        System.out.println(isCorrect("login", "prvrgtbrbrbrbassword", "password"));

    }

    public static boolean isCorrect(String login, String password, String confirmPass) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Wrong login");
            }
            if (password.length() > 20 || !password.equals(confirmPass)) {
                throw new WrongPasswordException("Wrong password");
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("login: " + login);
            System.out.println("password: " + password);
            System.out.println("confirm password: " + confirmPass);
        }

        return false;
    }
}
