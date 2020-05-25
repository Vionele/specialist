package ex.sveta.specialist;

public class Circle implements Shape {
    private int x;
    private int y;
    private double r;

    public Circle() {}

    public Circle(int x, int y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void draw() {
        System.out.println(toString());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
