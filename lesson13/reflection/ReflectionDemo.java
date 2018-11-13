package com.company.lesson13.reflection;

public class ReflectionDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Reflection reflection = new Reflection();
        CheckClazz checkClazz = new CheckClazz();

        /*reflection.showClassName(checkClazz);
        reflection.showClassFields(checkClazz);
        reflection.showClassMethod(demo);*/
        //reflection.showFieldsAnnotation(checkClazz);
        //reflection.fillPrivateFields(checkClazz);
        Object clone = reflection.createNewObject(checkClazz);
        reflection.showClassName(clone);

       /* System.out.println(checkClazz.getCheckAge());
        System.out.println(checkClazz.getCheckName());*/
    }
}
