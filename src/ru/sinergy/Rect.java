package ru.sinergy;

class Rect {
    double width;
    double height;

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    void magnify(int coeff) {
        width *= coeff;
        height *= coeff;
    }

    @Override
    public String toString() {
        return "ru.sinergy.Rect{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
