// Import all necessary classes

public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[4];

        // Instantiate and add shapes to the array
        shapes[0] = new Circle("Circle", 5); // Circle extends Ellipse, which extends Shape
        shapes[1] = new Ellipse("Ellipse", 6, 4); // Ellipse extends Shape
        shapes[2] = new Triangle("Triangle", 3, 4, 5); // Triangle extends Shape
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6); // EquilateralTriangle extends Triangle

        // Print details of shapes before scaling
        System.out.println("Shapes before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Scale all scalable shapes by a factor of 2
        double scaleFactor = 2.0;
        for (Shape shape : shapes) {
            if (shape instanceof Scalable scalableShape) {
                scalableShape.scale(scaleFactor);
            }
        }

        // Print details of shapes after scaling
        System.out.println("\nShapes after scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
