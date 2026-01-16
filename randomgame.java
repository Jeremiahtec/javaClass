import java.util.Random;
import java.util.Scanner;

public class randomgame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0-50:");
        int inputNum = input.nextInt();
        int randomNum = rand.nextInt(50);

        int i = 4;
        while (i > 0) {
            System.out.println("You have " + i + " attempts left.");
            if (inputNum == randomNum) {
                System.out.println("You guessed the correct number!");
                break;
            } else {
                System.out.println("Wrong guess. Try again:");
                inputNum = input.nextInt();
            }
            i--;
            System.out.println("Aw SHoot! out of tries!");
            System.out.println("The correct number was: " + randomNum);
        }
        input.close();
    }
}
