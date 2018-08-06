package com.company.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String regex2 = "[a-zA-Z]+\\s";
        String s = "One two three раз два три one1 two2 123 ";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(s);

        int count = 0;

        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }
        System.out.println(count);
    }
}
