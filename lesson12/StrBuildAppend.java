package com.company.lesson12;

public class StrBuildAppend {
    public static void main(String[] args) {
        String str = createStr(3, 56);
        System.out.println(insert(str));
        System.out.println(replace(str, "=", " равно "));
        //System.out.println(replace(str, "+", " плюс "));
        //System.out.println(replace(str, "*", " умножить "));
    }

    private static String createStr(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append("+").append(b).append("=").append(a + b).append("\n");
        sb.append(a).append("-").append(b).append("=").append(a - b).append("\n");
        sb.append(a).append("*").append(b).append("=").append(a * b);
        return sb.toString();
    }

    private static String insert(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int pos;
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(pos);
            stringBuilder.insert(pos, " равно ");
        }
        return stringBuilder.toString();
    }

    private static String replace(String str, String replaceFrom, String replaceTo) {
        StringBuilder stringBuilder = new StringBuilder(str);
        int pos;
        while ((pos = stringBuilder.indexOf(replaceFrom)) != -1) {
            stringBuilder.replace(pos, pos + replaceFrom.length(), replaceTo);
        }
        return stringBuilder.toString();
    }
}
