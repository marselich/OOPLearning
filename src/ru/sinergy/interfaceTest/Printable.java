package ru.sinergy.interfaceTest;

public interface Printable {
    void print();

    default void read(String str) {
        System.out.println("Read: " + str);
    }
}
