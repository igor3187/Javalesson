package com.company.lesson13.reflection;

public class CheckClazz {

    @Deprecated
    @CheckClassAnnotation
    private String checkName;

    @Deprecated
    @CheckClassAnnotation
    private String checkAge;

    public String getCheckName() {
        return checkName;
    }

    public String getCheckAge() {
        return checkAge;
    }
}
