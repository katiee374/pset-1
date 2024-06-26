import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Welcome to the beginning of your adventure game project! Before you begin 
 * in this file, read the instructions in README.md. Make a copy of this file 
 * in your project folder on your machine, which you will use throughout the 
 * semester.
 * 
 * Instructions:
 * Follow the inline instructions, where tasks are marked by "TODO:". In this 
 * file, you will accept user input and split that input into a format that 
 * the computer can understand. This will occur continuously until the user 
 * enters "q".
 * 
 * Finally, write  a description of the class and update the author and version
 * tags.
 * 
 * Write a description of class Game here.
 *
 * @author CS200 Instructors
 * @version 6.24.2024
 */
public class Game {
    public static void main(String[] args) throws IOException {
        //create new Scanner, which will take input from the keyboard
        Scanner scan = new Scanner(System.in);
        /*
         * TODO: Initialize String variable for input
         */

        /*
         * TODO: Write a while loop with the condition that input is not q.
         */

            /*
             * TODO:
             * Inside the loop, do the following:
             * 1. Print ">".
             * 2. Set input to scan.nextLine().
             * 3. Check if input is "q". If so, print a thank you message
             *    and break the loop.
             * 4. Create an ArrayList variable words and set it to 
             *    wordList(input).
             * 5. Run parseCommand(words).
             */
    }
    
    public static ArrayList<String> wordList(String input) {
        //these are the things that can separate words:
        String delims = "[\t,.:;?!\"']";
        //this splits the input String into an array of words
        String[] strArray = input.split(delims);
        ArrayList<String> words = new ArrayList<String>();
        /*
         * TODO: Add every element of strArray to words. Return words.
         */
        
    }
    
    public static void parseCommand(ArrayList<String> wordList) {
        //declared some variables for you
        String verb;
        String noun;
        ArrayList<String> commands = new ArrayList<String>
            (Arrays.asList("take", "drop"));
        ArrayList<String> objects = new ArrayList<String>
            (Arrays.asList("sword", "ring", "drop"));
        /*
         * TODO:
         * Write an if-else statement that follows this pseudocode:
         * if wordList has more than two elements, print a message saying only
         * two commands allowed
         * else set verb to the first element of wordList and noun to the 
         * second & check that the verb and object are contained in the lists
         * of commands and objects
         */
    }
}
