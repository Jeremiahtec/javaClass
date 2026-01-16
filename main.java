import java.util.Scanner;

public class main {
        public static void main() {
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter your the amount you want to deposit:");
        int depositAmount = amount.nextInt();
        System.out.println("Enter your the amount you want to deposit:");
        int depositAmount2 = amount.nextInt();
        System.out.println("Enter your the amount you want to deposit:");
        int depositAmount3 = amount.nextInt();
        int totalAmount = depositAmount + depositAmount2 + depositAmount3;
        System.out.println("The total amount you have deposited is: " + totalAmount);

        amount.close();
    }
}
