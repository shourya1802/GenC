public class InterfaceMain {

    public static void main(String[] args) {
        Printer printer = new SimplePrinter();
        printer.printDocument("MyDocument.txt");

        Scanner scanner = new MultiFunctionPrinter();
        scanner.scanDocument("MyDocument.txt");
    }

}