package week3books;
//********************************************************************
//  Book.java       Author: Lewis/Loftus
//
//  Represents a book. Used as the parent of a derived class to
//  demonstrate inheritance.
//********************************************************************

public  class Book {
    protected int pages = 1500;

    public Book(int p) {
        super();
        pages = p;
    }

    public Book() {
        super();
        pages = 300;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }
}
