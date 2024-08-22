package Calculation;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULATOR");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        System.out.println("The Addition of two numbers is:" +sum);
        System.out.println("The subtraction of two numbers is:" +sub);
        System.out.println("The Multiplication of two numbers is:" +mult);
        System.out.println("The Division of two numbers is:" +div);
		

	}

}
