import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result = 0;
        String operator;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /, sin, cos, tan, cot, sec, csc): ");
        operator = input.next();

        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            System.out.print("Enter second number: ");
            num2 = input.nextDouble();
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Invalid input. Cannot divide by zero.");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
        } else if (operator.equals("sin") || operator.equals("cos") || operator.equals("tan") || operator.equals("cot") || operator.equals("sec") || operator.equals("csc")) {
            System.out.print("Enter unit of measurement (deg or rad): ");
            String unit = input.next();
            switch (operator) {
                case "sin":
                    result = TrigonometricOperations.sin(num1, unit);
                    break;
                case "cos":
                    result = TrigonometricOperations.cos(num1, unit);
                    break;
                case "tan":
                    result = TrigonometricOperations.tan(num1, unit);
                    break;
                case "cot":
                    result = TrigonometricOperations.cot(num1, unit);
                    break;
                case "sec":
                    result = TrigonometricOperations.sec(num1, unit);
                    break;
                case "csc":
                    result = TrigonometricOperations.csc(num1, unit);
                    break;
            }
        } else {
            System.out.println("Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
    }
}
