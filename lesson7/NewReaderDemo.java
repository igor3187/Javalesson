package com.company.lesson7;

public class NewReaderDemo {
    public static void main(String[] args) {

        NewReader reader = new NewReader("Petya", "Petrov", "farmacy", 1, 1985, 8050 );
        Book adventures = new Book("Mayne Reid", "Headless Horseman");
        Book vocabulary = new Book("Sergey Ozhogov", "Russian Vocabulary");
        Book cyclopaedia = new Book("Andrew Bell", "Britannica");

       // reader.takeBook(3);
       // reader.takeBook("Headless Horseman", "Russian Vocabulary", "Britannica");
        reader.takeBook(adventures, vocabulary, cyclopaedia);

       // reader.returnBook(3);
       // reader.returnBook("Headless Horseman", "Russian Vocabulary", "Britannica");
        reader.returnBook(adventures, vocabulary, cyclopaedia);
    }



        //String[] array = {"Adventures", "Vocabulary", "Cyclopedia"};
}
