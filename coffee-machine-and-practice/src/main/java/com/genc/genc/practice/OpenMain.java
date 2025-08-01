public class OpenMain {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Rectangle(4, 6)
        };

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area: " + calculator.totalArea(shapes));
    }
}