import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("Supported operations:");
        System.out.println("  +, add");
        System.out.println("  -, subtract");
        System.out.println("  *, multiply");
        System.out.println("  /, divide");
        System.out.println("  %, modulus");
        System.out.println("  average, avg");
        System.out.println("  maximum, max");
        System.out.println("  minimum, min");
        System.out.println("  percentage, percent");
        System.out.println("  square");
        System.out.println("  cube");
        System.out.println("  abs, absolute");
        System.out.println("  even");
        System.out.println("  odd");
        System.out.println("  positive");
        System.out.println("  negative");
        System.out.println("Type 'exit' at any prompt to quit.");

        while (true) {
            System.out.print("Operation: ");
            String operation = scanner.nextLine().trim().toLowerCase();
            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            if (operation.isEmpty()) {
                System.out.println("Please enter an operation.");
                continue;
            }

            try {
                if (isUnaryOperation(operation)) {
                    Double number = promptNumber(scanner, "Number");
                    if (number == null) {
                        continue;
                    }
                    if (number.isNaN()) {
                        break;
                    }

                    double result = CalculatorOperation.calculate(number, operation);
                    printUnaryResult(operation, number, result);
                } else {
                    Double first = promptNumber(scanner, "First number");
                    if (first == null) {
                        continue;
                    }
                    if (first.isNaN()) {
                        break;
                    }

                    Double second = promptNumber(scanner, "Second number");
                    if (second == null) {
                        continue;
                    }
                    if (second.isNaN()) {
                        break;
                    }

                    double result = CalculatorOperation.calculate(first, second, operation);
                    printBinaryResult(operation, first, second, result);
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println();
        }

        System.out.println("Calculator closed.");
        scanner.close();
    }

    private static boolean isUnaryOperation(String operation) {
        return operation.equals("square")
                || operation.equals("cube")
                || operation.equals("abs")
                || operation.equals("absolute")
                || operation.equals("absolutevalue")
                || operation.equals("absolute value")
                || operation.equals("even")
                || operation.equals("odd")
                || operation.equals("positive")
                || operation.equals("negative");
    }

    private static Double promptNumber(Scanner scanner, String prompt) {
        System.out.print(prompt + ": ");
        String input = scanner.nextLine().trim();
        if (input.equalsIgnoreCase("exit")) {
            return Double.NaN;
        }
        Double number = parseNumber(input);
        if (number == null) {
            System.out.println("Invalid number. Please try again.");
        }
        return number;
    }

    private static void printUnaryResult(String operation, double number, double result) {
        switch (operation) {
            case "even", "odd", "positive", "negative" ->
                    System.out.printf("Result for %s %s: %s%n", operation, number, result == 1 ? "true" : "false");
            default -> System.out.printf("Result of %s(%s): %.4f%n", operation, number, result);
        }
    }

    private static void printBinaryResult(String operation, double first, double second, double result) {
        System.out.printf("Result of %s between %.4f and %.4f: %.4f%n", operation, first, second, result);
    }

    private static Double parseNumber(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException ex) {
            return null;
        }
    }
}
