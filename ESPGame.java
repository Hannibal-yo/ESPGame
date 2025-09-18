
/*
 * Class: CMSC203
 * Instructor: Ahmed Tarek
 * Description: A color-guessing game where the computer randomly selects
  a color and the player tries to predict it over multiple rounds.
 * Due: 9/17/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Hannibal Altasseb
 */


import java.util.Scanner;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();


        String color1 = "Red";
        String color2 = "Green";
        String color3 = "Blue";
        String color4 = "Orange";
        String color5 = "Yellow";
        String color6 = "Brown";
        String color7 = "Grey";


        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Describe yourself: ");
        String description = in.nextLine();

        System.out.print("Due date: ");
        String due = in.nextLine();

        System.out.print("Enter your #M number");
        String school = in.nextLine();

        System.out.println("\nCMSC203 Assignment1: Test your ESP skills!\n");

        int correct = 0;


        for (int i = 1; i <= 11; i++) {
            System.out.println("Round " + i);
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, Yellow, Brown, Grey?");
            System.out.print("Enter your guess: ");
            String guess = in.nextLine().trim();


            while (!(guess.equalsIgnoreCase(color1) || guess.equalsIgnoreCase(color2) ||
                     guess.equalsIgnoreCase(color3) || guess.equalsIgnoreCase(color4) ||
                     guess.equalsIgnoreCase(color5) || guess.equalsIgnoreCase(color6) ||
                     guess.equalsIgnoreCase(color7))) {
                System.out.print("Invalid color. Try again: ");
                guess = in.nextLine();
            }


            int number = rand.nextInt(7) + 1; // generates 1–7
            String holder = "";

            if (number == 1) holder = color1;
            if (number == 2) holder = color2;
            if (number == 3) holder = color3;
            if (number == 4) holder = color4;
            if (number == 5) holder = color5;
            if (number == 6) holder = color6;
            if (number == 7) holder = color7;


            System.out.println("I was thinking of " + holder + ".\n");


            if (guess.equalsIgnoreCase(holder)) {
                correct++;
            }
        }


        System.out.println("Game over");
        System.out.println("You guessed " + correct + " out of 11 colors correctly.");
        System.out.println("Student Name: " + name);
        System.out.println("#M " + school);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + due);
        System.out.println("Programmer: Tiyophlos Ephrem Hagos");

        System.exit(0);
    }
}


