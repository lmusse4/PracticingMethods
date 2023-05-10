import java.util.Scanner;
public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number:");
        double num2 = scanner.nextDouble();
        divide(num1, num2);
    }
    public static void divide(double num1, double num2) {
        double result = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
}
