package com.company.lesson7.secondLesson7;

public class Reader {

    private String name, birthDay, phoneNumber;
    private int libraryCard, faсulty, bookNum;

    public Reader(String name, String birthDay, String phoneNumber, int libraryCard, int faсulty, int bookNum) {
        this.name = name;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.libraryCard = libraryCard;
        this.faсulty = faсulty;
        this.bookNum = bookNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

    public int getFaсulty() {
        return faсulty;
    }

    public void setFaсulty(int faсulty) {
        this.faсulty = faсulty;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    @Override
    public String toString() {
        return "Reader{" + "name='" + name + '\'' + ", birthDay='" + birthDay + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", libraryCard=" + libraryCard + ", faсulty=" + faсulty + ", bookNum=" + bookNum + '}';
    }

    public static void main(String[] args) {
        Reader readerOne = new Reader("Poroh Petya Oleksiyovich", "31.04.1954", "80997776655", 23, 1, 3);
        Reader readerTwo = new Reader("Goroh Vanya Maksimovich", "01.07.1964", "80667778844", 13, 2, 1);
        Reader readerThree = new Reader("Doroh Kostya Serhiyovich", "22.02.1984", "80634445522", 12, 3, 2);

        Book1 adventure = new Book1("Б.Сушинский", "Золото Ромеля");
        Book1 vocabulary = new Book1("В.Даль", "Толковый словарь");
        Book1 encyclopedia = new Book1("Д.Дидро", "Энциклопедия наук и ремесел");

        Book1[] bookArr = {adventure, vocabulary, encyclopedia};

        readerOne.takeBook(bookArr[0], bookArr[1]);

    }

    private void takeBook(Book1... books) {
        System.out.println(this.getName() + " take books: ");
        for (Book1 o : books) {
            System.out.println(o.getAuthor() + " " + o.getBookName());
        }
    }

    int takeBook(int bookNum) {
        System.out.println("Reader " + this.name + " birth day " + this.birthDay + " phone number " + this.phoneNumber + " faculty " + this.faсulty + " library card " + this.libraryCard + " take " + this.bookNum + " books");
        return bookNum;
    }

    void takeBook() {
        System.out.println("Reader " + this.name + " birth day " + this.birthDay + " phone number " + this.phoneNumber + " faculty " + this.faсulty + " library card " + this.libraryCard + " take " + this.bookNum + " books: ");
        //return bookName;
    }

}