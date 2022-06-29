package ru.sinergy.constructorTest;

public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(1, 2);
        fr.addToNumerator().addToNumerator().addToNumerator().addToNumerator().addToNumerator();
    }
}

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if(denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction addToNumerator() {
        this.numerator++;
        return this;
    }

    public Fraction getObjectCurrent() {
        return this;
    }
}
