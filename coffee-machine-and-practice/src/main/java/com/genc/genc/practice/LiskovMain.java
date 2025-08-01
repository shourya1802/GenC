public class LiskovMain {

    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        // Demonstrating Single Responsibility Principle
        // SingleResponsibility singleResponsibility = new SingleResponsibility();
        // singleResponsibility.generateReport();
        // singleResponsibility.sendReport("NC");

        // // Demonstrating Open/Closed Principle
        // OpenClosed openClosed = new OpenClosed();
        // openClosed.demonstrateOpenClosed();

        Bird sparrow = new Sparrow();
        makeBirdFly(sparrow); // This works fine

        Bird ostrich = new Ostrich();
        makeBirdFly(ostrich); // This will throw an exception

    }
}