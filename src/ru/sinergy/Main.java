package ru.sinergy;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(5,3);
        Rect rect1 = new Rect(23,52);
        Rect rect2 = new Rect(232,12);

        System.out.println(rect.getArea());
        System.out.println(rect1.getArea());
        System.out.println(rect2.getArea());

        System.out.println(rect2.getArea());

        rect2.magnify(3);
        System.out.println(rect2.getArea());

        Point point1 = new Point();
        Point point2 = new Point();

        point1.input();
        System.out.println(point1);

        point2.input();
        System.out.println(point2);

        System.out.println(point1.getDistance(point2));

        System.out.println("Start moving point1");
        point1.move(12, 32);
        System.out.println(point1);

        System.out.println(point1.getDistance(point2));

        Double number = Double.valueOf(12.3);
        double a = number.doubleValue();
        System.out.println(a);
        String str = "125";
        int num = Integer.parseInt(str);
        int c = num; // автораспаковка
        System.out.println(c);
    }
}