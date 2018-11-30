package com.company.lesson16;

import com.company.lesson7.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    /*@Override
    public int compare(Person o1, Person o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    } */
    @Override
    public int compare(Person o1, Person o2) {
        int result =  o1.getFullName().compareTo(o2.getFullName());
        if (result != 0){
            return result;
        }else {
            return o1.getAge() - o2.getAge();
        }
    }
}
