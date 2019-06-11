package oop;

public class Triangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    private double a;
    private double b;
    private double c;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        a = getDistance(x1, y1, x2, y2);
        b = getDistance(x1, y1, x3, y3);
        c = getDistance(x2, y2, x3, y3);
    }

    private double getDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean isTriangle() {
        return a + b > c || a + c > b || b + c > a;
    }

    public String getType() {

        if (!isTriangle()) {
            return "khong phai la tam giac";
        }

        if (a == b && a == c) {
            return "tam giac deu";
        }

        if ((a - b) * (a - c) * (b - c) != 0) {

            if (c * c == a * a + b * b || b * b == a * a + c * c || a * a == c * c + b * b) {
                return "tam giac vuong";
            }

            return "tam giac binh thuong";
        }
        return "tam giac can";
    }

    public double getPerimeter() {

        if (!isTriangle()) {
            return -1;
        }

        return a + b + c;
    }

    public double getArea() {

        if (!isTriangle()) {
            return -1;
        }

        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
