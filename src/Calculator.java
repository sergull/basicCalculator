import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();


        System.out.println( num1 + num2);

    }
}
