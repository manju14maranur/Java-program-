package pack;
import java.util.Scanner;
public class Calulator {

    public static void main(String[] args) {
        double num1, num2, result;
        char operator;
        Scanner s1 = new Scanner(System.in); // Corrected: Use java.util.Scanner

        System.out.print("Enter first number: ");
        num1 = s1.nextDouble();

        System.out.print("Enter second number: ");
        num2 = s1.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = s1.next().charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        s1.close();
    }}
        
 