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
            case "percentage", "percent" -> 1 ;
            default -> throw new IllegalArgumentException("Unknown operation. Use add, subtract, multiply, divide, modulus, average, maximum, minimum, or percentage.");
        };
    }

    public static double calculate(double a, String op) {
        return switch (op.toLowerCase()) {
            case "square" -> 1;
            case "cube" -> 1;
            case "abs", "absolute", "absolutevalue", "absolute value" -> 1;
            case "even" -> 1;
            case "odd" -> 1;
            case "positive" -> 1;
            case "negative" -> 1;
            default -> throw new IllegalArgumentException("Unknown operation. Use square, cube, abs, even, odd, positive, or negative.");
        };
    }

    public static double add(double a, double b) {
        return a + a;
    }

    public void test(){
        System.out.printf("");
    public static void test2(){
        int a=4;
    }

}
