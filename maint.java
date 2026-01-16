
import java.util.Scanner;

public class maint {
    public static void main(String[] args) {
        int richManAmount = 1000000;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the amount you have:");
        int userAmount = userInput.nextInt();
        if (userAmount > richManAmount) {
            System.out.println("You are richer than the rich man!");
        } else {
            System.out.println("You are not richer than the rich man.");
        }
        userInput.close();
    }
}
