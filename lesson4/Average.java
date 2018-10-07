package com.company.lesson4;

public class Average {
    public static void main(String[] args) {
    /*    double []average = {1.2, 2.3, 3.4, 4.5, 5.4};

        double result = 0;

        for (double d : average) {
            result += d;

            System.out.println(result / average.length);
        }
    }*/
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (double d : nums) {
            result += d;
        }
        System.out.println("Average is " + result / nums.length);


    }
}
