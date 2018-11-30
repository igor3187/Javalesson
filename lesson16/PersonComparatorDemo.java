package com.company.lesson16;

import com.company.lesson7.Person;

import java.util.SortedSet;
import java.util.TreeSet;

public class PersonComparatorDemo {
    public static void main(String[] args) {
        //PersonComparator personComparator = new PersonComparator();
        SortedSet<Person> set = new TreeSet<>((o1, o2) -> {
            int result = o1.getFullName().compareTo(o2.getFullName());
            if (result != 0){
                return result;
            }else{
                return o1.getAge() - o2.getAge();
            }
        });

        set.add(new Person("Sasha Ivanov", 18));
        set.add(new Person("Vova Ivanov", 32));
        set.add(new Person("Masha Petrova", 26));
        set.add(new Person("Dasha Sidorova", 19));
        set.add(new Person("Vova Ivanov", 26));

        for (Person person: set){
            System.out.println(person);
        }
    }
}
