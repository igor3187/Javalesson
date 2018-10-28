package com.company.lesson7;

public class SomePhoneDemo {
    public static void main(String[] args) {
        SomePhone somePhone1 = new SomePhone("Apple", "80675758009", 0.5);
        SomePhone somePhone2 = new SomePhone("Sony","937770099", 0.7 );
        SomePhone somePhone3 = new SomePhone();

       /* somePhone1.model = "Apple";
        somePhone1.number = "687770099";
        somePhone1.weight = 0.5;

        somePhone2.model = "Sony";
        somePhone2.number = 937770099;
        somePhone2.weight = 0.7;

        somePhone3.model = "Lenovo";
        somePhone3.number = 667770099;
        somePhone3.weight = 0.4;*/

        somePhone1.receiveCall("Mama");
        somePhone1.sendMessage("980978870", "345425255", "2535235235");
        somePhone2.sendMessage("980978870", "345425255");
        somePhone3.receiveCall("Papa", "80959998877");
        System.out.println(somePhone1.getModel());
        somePhone1.setModel("Nomi");
        System.out.println(somePhone1.getModel());
        System.out.println(SomePhone.getCount());

      /*  System.out.println(somePhone1.model + " " + somePhone1.number + " " + somePhone1.weight);
        System.out.println(somePhone2.model + " " + somePhone2.number + " " + somePhone2.weight);
        System.out.println(somePhone3.model + " " + somePhone3.number + " " + somePhone3.weight);*/
    }
}
