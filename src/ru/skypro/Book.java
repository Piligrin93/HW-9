package ru.skypro;

public class Book {
    private String nameBook;
    public Author nameAuthor;
    private int yearPublication;

    public Book(String nameBook, int yearPublication) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.yearPublication = yearPublication;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
