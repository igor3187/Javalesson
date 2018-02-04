package com.company;
/*Передать на вход программы число в качестве аргумента.
 Если оно нечетное, распечатать его. Используем оператор if.
  Используйте метод Integer.parseInt() для преобразования из String в int. (Задание с урока.)
  */
public class OddNum1 {
    public static void main(String[] args) {
        int e = Integer.parseInt(args[0]);
        if (e % 2 != 0) {
            System.out.println("Number is not even!");
        }

    }
}
