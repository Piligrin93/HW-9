package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Михаил", "Булгаков");
        System.out.println("Автор книги " + author1.getFirstNameAuthor() + " " + author1.getLastNameAuthor());
        Book book1 = new Book("Мастер и Маргарита", 2007);
        book1.setYearPublication(2008);
        System.out.println(book1.getNameBook() + " " + author1.getFullNameAuthor() + " " + book1.getYearPublication());

        System.out.println("----------");

        Author author2 = new Author("Джордж", "Мартин");
        System.out.println("Автор книги " + author2.getFirstNameAuthor() + " " + author2.getLastNameAuthor());
        Book book2 = new Book("Песнь льда и пламени", 2014);
        book1.setYearPublication(2015);
        System.out.println(book2.getNameBook() + " " + author2.getFullNameAuthor() + " " + book2.getYearPublication());
    }
}
