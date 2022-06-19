package ru.sinergy.constructorTest;

import java.util.Scanner;

public class Main {
    public static final int MAGNIFIER = 1000;

    public static void main(String[] args) {
//        Person person = new Person("Oleg", 23);
//        System.out.println("Name: " + person.getName());
//        System.out.println("Age: " + person.getAge());
//        Scanner in = new Scanner(System.in);
//        person.setName(in.next());
//        System.out.println("New name: " + person.getName());
//        person.setAge(in.nextInt());
//        System.out.println("New age: " + person.getAge());

        Fraction fraction = new Fraction(23, 52);
        System.out.println(fraction.getFraction());
        fraction.setFraction(11,55);
        System.out.println(fraction.getFraction());

        Employee olya = new Employee();
        olya.setFirstName("Olya");
        olya.setLastName("Kalugina");
        olya.setGender('f');
        System.out.println(olya);

        Person mars = new Person("Marsel", "Kaliev", 'm');

        System.out.println(mars);

        Person olya2 = olya;

        ((Employee)olya2).setPosition("director");
        ((Employee)olya2).tellMeWhoAreYou();

        System.out.println(olya2);
    }
}

//class Person {
//    int id;
//    private String name;
//    private int age;
//    private static int counter;
//
//    static {
//        System.out.println(counter);
//    }
//    public Person(String name, int age) {
//        id = counter++;
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        if(age > 0 && age < 110)
//            this.age = age;
//    }
//}

class Fraction {
    private double numerator;
    private double denominator = 1;


    public double getFraction() {
        return numerator / denominator;
    }

    public void setFraction(double num, double den) {
        numerator = num;
        denominator = den;
    }

    public Fraction(double numerator, double denominator) {
        if(denominator == 0) {
            System.out.println("Error");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected char gender; // m, f

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person() {
        this("", "", ' ');
    }

    public Person(String firstName) {
        this(firstName, "", ' ');
    }

    public Person(String firstName, String lastName, char gender) {
        this(firstName, lastName);
        this.gender = gender;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}

class Employee extends Person {
    protected String position;

    public void setPosition(String position) {
        this.position = position;
    }

    public void tellMeWhoAreYou() {
        System.out.println("Hello, I'm " + this.getClass());
    }
    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}