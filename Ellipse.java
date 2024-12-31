public class Ellipse extends Shape implements Scalable {
    private double a; // Major axis
    private double b; // Minor axis

    public Ellipse(String name, double a, double b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (a * a + b * b) - (a - b) * (a - b) / 2);
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
