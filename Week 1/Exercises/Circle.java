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
        this.radius = radius;
    }

    public int getArea() {
        int area = (int)(Math.PI * Math.pow(this.radius, 2));
        return area;
    }
}