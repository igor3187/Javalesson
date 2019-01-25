package com.company.eShop1;

import java.util.Scanner;

public class EShop {
    public static Scanner s;

    private static User user1 = new User("user1", "user1");
    private static User user2 = new User("user2", "user2");
    private static User user3 = new User("user3", "user3");

    private static User[] users = {user1, user2, user3};

    private static Category[] catalogList = categoryList();
    private static Product[] phones = phonesList();
    private static Product[] tv = tvList();
    private static Product[] console = consoleList();
    //private static Product[] productsShowList = productList();

    public static void main(String[] args) {

        Basket[] baskets = {};

        System.out.println("Enter your login and password: ");
        userLogIn();

        System.out.println("SELECT ACTIONS: 1 - Catalog list, 2 - Product list, 3 - Basket, 4 - Purchase");
        selectActions();

    }

    private static void userLogIn() {
        s = new Scanner(System.in);
        boolean chek = false;
        if (s.hasNext()) {
            String userLogIn = s.next();
            if (!verifyLogin(userLogIn)) {
                System.out.println("Enter correct login/password!");
                System.exit(0);
            }
        }
    }

    private static boolean verifyLogin(String userLogIn) {
        for (User user : users) {
            if (user.getLogin().equals(userLogIn)) {
                return true;
            }
        }
        return false;
    }

    private static Category[] categoryList() {
        Product phone1 = new Product("Samsung", 500, 4);
        Product phone2 = new Product("Xiaomi", 200, 2);
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

        Category[] catalogList = {phone, tv, console};

        return catalogList;
    }

    private static Product[] phonesList() {
        Product phone1 = new Product("Samsung", 500, 4);
        Product phone2 = new Product("Xiaomi", 200, 2);
        Product phone3 = new Product("Iphone", 700, 5);

        Product[] phones = {phone1, phone2, phone3};
        return phones;
    }

    private static Product[] tvList() {
        Product tv1 = new Product("Sony", 400, 4);
        Product tv2 = new Product("LG", 500, 4);
        Product tv3 = new Product("Samsung", 600, 5);

        Product[] tvs = {tv1, tv2, tv3};
        return tvs;
    }

    private static Product[] consoleList() {
        Product console1 = new Product("Playstation", 300, 5);
        Product console2 = new Product("X-Box", 400, 4);
        Product console3 = new Product("Nintendo", 350, 3);

        Product[] consoles = {console1, console2, console3};
        return consoles;
    }

   /* private static Product[] productList() {
        Product phone1 = new Product("Samsung", 500, 4);
        Product phone2 = new Product("Xiaomi", 200, 2);
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

        Product[]  products = {phones, tvs, consoles};
        return products;
    }*/

    private static void selectActions() {
        s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int actions = s.nextInt();

            switch (actions) {
                case 1:
                    for (Category category : catalogList) {
                        System.out.println(category.getName());
                    }
                    System.out.println();
                    System.out.println("CHOICE PRODUCT: 1 - Phones. 2 - TV. 3 - Console.");
                    s = new Scanner(System.in);
                    if (s.hasNextInt()) {
                        int choiceCategory = s.nextInt();
                        switch (choiceCategory) {
                            case 1:
                                for (Product product : phones) {
                                    System.out.println(product.getName());
                                }
                                break;
                            case 2:
                                for (Product product : tv) {
                                    System.out.println(product.getName());
                                }
                                break;
                            case 3:
                                for (Product product : console) {
                                    System.out.println(product.getName());
                                }
                            default:
                                System.out.println("Invalid data input!");
                        }
                    }
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
}
