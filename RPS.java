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
 * version notes: fully functioning program; remove & replace with student
 * instructions
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
            //take in user input
            int userChoice = scan.nextInt();
            if (userChoice==0) {
                //fill in body
                System.out.println("Thanks for playing!");
                continueGame = false;
            }
            //fill in conditional
            if (userChoice==computerChoice) {
                System.out.println("Tie!");
            }
            else if (userChoice==1 && computerChoice==2) {
                System.out.println("You lose. Computer wins.");
            }
            else if (userChoice==2 && computerChoice==3) {
                System.out.println("You lose. Computer wins.");
            }
            else if (userChoice==3 && computerChoice==1) {
                System.out.println("You lose. Computer wins.");
            }
            else {
                if (continueGame) {
                    System.out.println("Congrats, you win!");
                }
            }
        }
    }
}
