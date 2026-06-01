public class CalculatorOperation {
    public static double calculate(double a, double b, String op) {
        return switch (op.toLowerCase()) {
            case "+", "add" -> add(a, b);
            case "-", "subtract" -> a - b;
            case "*", "multiply" -> a * b;
            case "/", "divide" -> {
                if (b == 0) throw new IllegalArgumentException("Division by zero error.");
                yield a / b;
            }
            case "%", "mod", "modulus" -> {
                if (b == 0) throw new IllegalArgumentException("Modulus by zero error.");
                yield a % b;
            }
            case "avg", "average" -> (a + b) / 2.0;
            case "max", "maximum" -> Math.max(a, b);
            case "min", "minimum" -> Math.min(a, b);
            case "percentage", "percent" -> {
                if (b == 0) throw new IllegalArgumentException("Total cannot be zero.");
                yield (a / b) * 100.0;
            }
            default -> throw new IllegalArgumentException("Unknown operation.");
        };
    }

    public static double calculate(double a, String op) {
        return switch (op.toLowerCase()) {
            case "square" -> a * a;
            case "cube" -> a * a * a;
            case "abs", "absolute", "absolutevalue", "absolute value" -> Math.abs(a);
            case "even" -> isEven(a) ? 1.0 : 0.0;
            case "odd" -> !isEven(a) ? 1.0 : 0.0;
            case "positive" -> a > 0 ? 1.0 : 0.0;
            case "negative" -> a < 0 ? 1.0 : 0.0;
            default -> throw new IllegalArgumentException("Unknown operation.");
        };
    }

    public static double add(double a, double b) {
        return a + b; // Fixed: now correctly returns a + b
    }

    public static boolean isEven(double a) {
        return (a % 1 == 0) && ((int) a % 2 == 0);
    }
}
