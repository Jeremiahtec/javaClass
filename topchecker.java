import java.util.Scanner;

public class topchecker {
    public static void main(){
        Scanner uInput = new Scanner(System.in);
        System.out.println("Enter the the amount of candidates");
        int cands = uInput.nextInt();
        int highCand = 0;
        // int noOfCands = cands;
        int i = 1;
        for(i = 1; i <= cands; i++){
            System.out.println("Input Candidate" + i + " score :");
            int candScore = uInput.nextInt();
            if (candScore > highCand){
                highCand = candScore;
            }
        }
        System.out.println("Student" + (i - 1) + " is the highest with the total of " + highCand);
        uInput.close();
        
    }
}
