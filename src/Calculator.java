import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        if(op=='+'){
            System.out.println(num1+num2);
        }

        else if(op=='-'){
            System.out.println(num1-num2);
        }

        else if(op=='*'){
            System.out.println(num1*num2);
        }
        else if(op=='/'){
            if (num2!=0){
                System.out.println(num1/num2);
            }
        }
    }
}
