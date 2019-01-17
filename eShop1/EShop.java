package com.company.eShop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EShop {
    static Scanner s;

    public static void main(String[] args) throws InputMismatchException {
        Product phone1 = new Product("Samsung", 500, 4);
        Product phone2 = new Product("Sl", 200, 2);
        Product phone3 = new Product("Iphone", 700, 5);

        Product[] phones = {phone1, phone2, phone3};

        Product tv1 = new Product("Sony", 400, 4);
        Product tv2 = new Product("LG", 500, 4);
        Product tv3 = new Product("Samsung", 600, 5);

        Product[] tvs = {tv1, tv2, tv3};

        Product console1 = new Product("Playstation", 300, 5);
        Product console2 = new Product("X-Box", 400, 4);
        Product console3 = new Product("Nintendo", 350, 3);

        Product[] consoles = {console1, console2, console3};

        Category phone = new Category("Phones", phones);
        Category tv = new Category("Tv", tvs);
        Category console = new Category("Console", consoles);

        Basket[] baskets = {};

        User user1 = new User("user1", "user1");
        User user2 = new User("user2", "user2");
        User user3 = new User("user3", "user3");

        System.out.println("Enter your login and password: ");
        userLogIn();

        System.out.println("Select actions: 1 =\"catalog list\", 2 =\"product list\", 3 =\"basket\", 4 =\"purchase\" ");
        selectActions();
    }

    private static void selectActions() {
        s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int actions = s.nextInt();

            switch (actions) {
                case 1:
                    System.out.println(Selection.CATALOGLIST);
                    break;
                case 2:
                    System.out.println(Selection.PRODUCTLIST);
                    break;
                case 3:
                    System.out.println(Selection.BASKET);
                    break;
                case 4:
                    System.out.println(Selection.PURCHASE);
                default:
                    System.out.println("Enter correct num of actions!!");
            }
        }
    }

    private static void userLogIn() {
        s = new Scanner(System.in);
        if (s.hasNext()) {
            String userLogIn = s.next();

            switch (userLogIn) {
                case "user1":
                    userLogIn = "user1 user1";
                    System.out.println(userLogIn);
                    break;
                case "user2":
                    userLogIn = "user2 user2";
                    System.out.println(userLogIn);
                    break;
                case "user3":
                    userLogIn = "user3";
                    System.out.println(userLogIn);
                    break;
                default:
                    System.out.println("Enter correct login/password!!");
            }
        }
    }
}
