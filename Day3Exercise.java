package com.challenge.homework;

import java.util.Scanner;

/* Day 3 Challenge:
System.out.println("What kind of thing are we talking about?");
Scanner input = new Scanner(System.in);
String a = input.next();
System.out.println("How would you describe it? Big? Azure? Tattered?");
String b = input.next();
String c = "of Doom";
String d = "3000";
System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");
 */
public class Day3Exercise {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?"); // asking by printing question.

        /* Now using the Scanner class
         by which the user input can be received
         */
        Scanner input = new Scanner(System.in);
        String a = input.nextLine(); // assign the user input to the variable (a). *nextLine

        System.out.println("How would you describe it? Big? Azure? Tattered?");

        /* (nextLine) instead of (next)
        to start new line o
        therwise the user will not be able to tybe
         */
        String b = input.nextLine(); // *nextLine
        String c = "of Doom";
        String d = "3000";

        System.out.println("The " + a + " " + b + " " + c + " " + d + "!");
        //swap a and b and delete of then the sentence would make more sense

        /*
        Question?
         */



    }
}
