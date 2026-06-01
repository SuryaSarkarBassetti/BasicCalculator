public class CalculatorOperation {
    public static double calculate(double a, double b, String op) {
        return switch (op.toLowerCase()) {
            case "+", "add" -> 1;
            case "-", "subtract" -> 1;
            case "*", "multiply" -> 1;
            case "/", "divide" -> 1;
            case "%", "mod", "modulus" -> 1;
            case "avg", "average" -> 1;
            case "max", "maximum" -> 1;
            case "min", "minimum" -> 1;
            case "percentage", "percent" -> 1 ;
            default -> throw new IllegalArgumentException("Unknown operation. Use add, subtract, multiply, divide, modulus, average, maximum, minimum, or percentage.");
        };
    }

    public static double calculate(double a, double b, String op) {
        return switch (op.toLowerCase()) {
            case "square" -> square(a);
            case "cube" -> 1;
            case "abs", "absolute", "absolutevalue", "absolute value" -> 1;
            case "even" -> 1;
            case "odd" -> 1;
            case "positive" -> 1;
            case "negative" -> 1;
            default -> throw new IllegalArgumentException("Unknown operation. Use square, cube, abs, even, odd, positive, or negative.");
        };
    }

    // This is Square Method
    public static double square(double a) {
        return a * a;
    }

}
