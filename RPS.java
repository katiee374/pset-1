import java.util.Scanner;
import java.util.Random;
/**
 * Instructions:
 * This program takes user input and plays rock paper scissors with the user,
 * choosing randomly from the three options. Your job is to fill in the tasks
 * that have been commented out, so that the program runs as intended.
 * 
 * Follow the instructions and then delete the comments. Test your code by 
 * playing the game.
 * 
 * Finally, add a description of the class, and update the author and version
 * tags.
 * 
 * Write a description of class RPS here.
 *
 * @author CS200 Instructors
 * @version 6.20.2024
 */
public class RPS
{
    public static void main(String[] args) {
        //some objects have been initialized for you.
        //the scanner takes in user input from System.in, the keyboard
        Scanner scan = new Scanner(System.in);
        //the random object is a random number generator
        Random rand = new Random();
        //this array contains the options for choices in the game
        String[] options = {"Rock", "Paper", "Scissors"};
        /**
         * TODO: initialize a boolean variable so that we will know if the 
         * user wants to continue the game. Set it to true.
         */
        //code below:
        
        
        //intializing loop, so that the game continues until the user enters 0
        while (/*put the name of your boolean variable here*/) {
            /**
             * TODO: Print user options (Rock, paper, and scissors, in that 
             * order) to the screen in a numbered list.
             * Hint: Use "\n" to mean new line rather than separate println
             * statements.
             */
            //code below:
            
            /**
             * TODO: Prompt the user to enter the number of their choice, or
             * 0 to quit.
             */
            //code below:
            
            //initializing computer's choice
            int computerChoice = rand.nextInt(3)+1;
            //take in user's choice
            int userChoice = scan.nextInt();
            /**
             * TODO: Write an if statement that checks if the user has entered
             * zero. If so, print a thank you message and set the boolean
             * variable to false.
             */
            //code below:
            
            /**
             * TODO: Fill in the conditional statements below. They are all
             * condiitional statements between userChoice, computerChoice,
             * and integers. There are three ways for the user to lose, and
             * one way for them to tie. The situation where the user wins
             * has been filled in at the bottom.
             */
            if (/* fill in here */) {
                System.out.println("Tie!");
            }
            else if (/* fill in here */) {
                System.out.println("You lose. Computer wins.");
            }
            else if (/* fill in here */) {
                System.out.println("You lose. Computer wins.");
            }
            else if (/* fill in here */) {
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
