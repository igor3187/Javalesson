package com.company.eShop1;

import java.util.Objects;

public class User {

    private String login, password;

    private Basket basket = new Basket();

    public User(Basket basket) {
        this.basket = basket;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getLogin(), user.getLogin()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getBasket(), user.getBasket());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword(), getBasket());
    }

    @Override
    public String toString() {
        return "User{" + "login='" + login + '\'' + ", password='" + password + '\'' + ", basket=" + basket + '}';
    }
}
