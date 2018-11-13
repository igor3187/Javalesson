package com.company.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewRegex {
    public static void main(String[] args) {
        String regex  = "Java\\s*\\d{1,2}";
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 11.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }

}
