import java.util.Scanner;

public class Methods {

    public static int addNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = no.nextInt();

        System.out.print("Enter second number: ");
        int b = no.nextInt();

        System.out.println(addNumber(a, b));
    }
}
