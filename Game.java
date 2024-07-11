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
         * TODO: Initialize String variable input
         */

        while (!input.equals("q")) {

            /*
             * TODO:
             * Inside the loop, do the following:
             * 1. Print ">".
             * 2. Set input to scan.nextLine().
             * 3. Check if input is "q". If so, print a thank you message
             *    and break the loop using the command "break". We do this 
             *    here so that we don't attempt to parse the command "q".
             * 4. Create a String array variable words and set it to 
             *    wordList(input).
             * 5. Run parseCommand(words).
             */
        }
        scan.close();
    }
    
    /**
     * A method that splits the input String into words.
     * 
     * @param input - the String to be split
     * @return words - array of Strings that are the words in the input 
     *         Strings
     */
    public static String[] wordList(String input) {
        //these are the things that can separate words:
        String delims = "[\t,.:;?!\"']";
        //this splits the input String into an array of words
        String[] strArray = input.split(delims);
        return strArray;
    }
    /*
     * For now, this method serves no purpose. Eventually, this method will 
     * use the command to perform actions.
     */
    /**
     * A method to perform an action based on user input.
     * 
     * @param wordList - a String array containing valid words from the 
     *        command.
     */
    public static void parseCommand(String[] wordList) {
        //declared some variables
        String verb;
        String noun;
        String[] commands = {"take", "drop"};
        String[] objects = {"sword", "ring", "key"};
        verb = wordList[0];
        noun = wordList[1];
    }
}