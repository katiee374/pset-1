import java.util.Scanner;
import java.util.Random;
/**
 * Instructions:
 * This program takes user input and plays rock paper scissors with the user,
 * choosing randomly from the three options. Your job is to fill in the tasks
 * that have been commented out, so that the program runs as intended.
 *
 * @author CS200 Instructors
 * @version 6.17.2024
 */
public class RPS
{
    public static void main(String[] args) {
        boolean continueGame = true;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};
        //intialize loop, so that the game continues until the user enters 0
        while (continueGame) {
            System.out.println("Choose from:\n1. Rock\n2. Paper\n3. Scissors");
            System.out.println("Enter the number of your choice or 0 to quit.");
            int computerChoice = rand.nextInt(3)+1;
            int userChoice = scan.nextInt();
            if (userChoice==0) {
                continueGame = false;
            }
            if (userChoice==computerChoice) {
                System.out.println("Tie!");
            }
        }
    }
}
