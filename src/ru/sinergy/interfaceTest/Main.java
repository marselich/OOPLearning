package ru.sinergy.interfaceTest;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Voyna i mir", "Tolstoy L.N.");
        book.print();

        book.read(book.getName());

        Printable bookPrintable = book;
        bookPrintable.print();

        Journal journal = new Journal("Pravda");
        journal.getName();
        journal.print();

        Printable journalPrintable = journal;
        journalPrintable.print();

    }
}

class Book implements Printable {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}

class Journal implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public Journal(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
