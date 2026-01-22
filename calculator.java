import java.util.Scanner;

public class calculator {

    public static int addNumber(int a, int b) {
        return a + b;
    }

        public static int subNumber(int a, int b) {
        return a - b;
    }

        public static int divNumber(int a, int b) {
        return a / b;
    }

        public static int mulNumber(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Enter the first initial number: ");
        int firstnumber = inputs.nextInt();
        System.out.println("Enter the second number: ");
        int secondnumber = inputs.nextInt();
        System.out.println("Please select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int UserChoice = inputs.nextInt();
        if (UserChoice == 1) {
            System.out.println(addNumber(firstnumber, secondnumber));
        }else if (UserChoice == 2){
            System.out.println(subNumber(firstnumber, secondnumber));
        }else if (UserChoice == 3){
            System.out.println(mulNumber(firstnumber, secondnumber));
        }else if (UserChoice == 4){
            System.out.println(divNumber(firstnumber, secondnumber));
        }
        else {
            System.out.println("Invalid choice. Please restart and select a valid option.");
        }
        inputs.close();
    }
}