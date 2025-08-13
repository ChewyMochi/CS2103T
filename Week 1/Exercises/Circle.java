public class Circle {
    private int x;
    private int y;
    private double radius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public int getArea() {
        int area = (int)(Math.PI * Math.pow(this.radius, 2));
        return area;
    }
}