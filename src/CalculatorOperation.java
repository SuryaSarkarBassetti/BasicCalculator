public class CalculatorOperation {

    public static double calculate(double a, double b, String op) {
        return switch (op.toLowerCase()) {
            case "+", "add" -> add(a, b);
            case "-", "subtract" -> 1;
            case "*", "multiply" -> 1;
            case "/", "divide" -> 1;
            case "%", "mod", "modulus" -> 1;
            case "avg", "average" -> 1;
            case "max", "maximum" -> 1;
            case "min", "minimum" -> 1;
            case "percentage", "percent" -> 1;
            default -> throw new IllegalArgumentException(
                    "Unknown operation. Use add, subtract, multiply, divide, modulus, average, maximum, minimum, or percentage.");
        };
    }

    public static double calculate(double number, String op) {
        return switch (op.toLowerCase()) {
            case "square" -> square(number);
            case "cube" -> 1;
            case "abs", "absolute", "absolutevalue", "absolute value" -> absoluteValue(number);
            case "even" -> 1;
            case "odd" -> 1;
            case "positive" -> 1;
            case "negative" -> 1;
            default -> throw new IllegalArgumentException(
                    "Unknown operation. Use square, cube, abs, even, odd, positive, or negative.");
        };
    }

    // Add Method
    public static double add(double a, double b) {
        return a + b;
    }

    // Percentage Method
    public static double percentage(double a, double b) {
        return (a / b) * 100;
    }

    // This Is Square Method
    public static double square(double a) {
        return a * a;
    }

    public static double absoluteValue(double number) {
        return Math.abs(number);
    }

    public static double division(double a, double b) {
        return a / b;
    }
    // Subtraction Between Two Number
    public static double subtraction(double a, double b) {
        return a - b;
    }
    // Avarage Between Two Number
     public static double avarage(double a, double b) {
        return (a + b)/2;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // Implementation of ODD Number Checker
    public static boolean checkOddNum(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
