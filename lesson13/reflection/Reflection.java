package com.company.lesson13.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    
    public void showClassName(Object o) {
        Class clazz = o.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassFields(Object o) {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    public void showClassMethod(Object o) {
        Class clazz = o.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    public void showFieldsAnnotation(Object o) {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(field.getName() + ":" + annotation.toString());
            }
        }
    }

    public void fillPrivateFields(Object o) throws IllegalAccessException {
        Class clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(CheckClassAnnotation.class);
            if (annotation == null) {
                continue;
            }
            field.setAccessible(true);
            field.set(o, "Field");
            field.setAccessible(false);
        }
    }

    public Object createNewObject(Object o) throws IllegalAccessException, InstantiationException {
        Class clazz = o.getClass();
        return clazz.newInstance();
    }
}