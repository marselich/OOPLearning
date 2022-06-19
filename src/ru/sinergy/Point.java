package ru.sinergy;

import java.util.Scanner;

public class Point {
    private double x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        move(x, y);
    }

    double getDistance(Point a) {
        return Math.sqrt(Math.pow(x - a.x, 2) + Math.pow(y - a.y, 2));
    }

    @Override
    public String toString() {
        return "ru.sinergy.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
