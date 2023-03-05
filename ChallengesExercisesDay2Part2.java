package com.challenge.homework;

import java.util.Scanner;
public class ChallengesExercisesDay2Part2 {
    public static void main(String[] args) {
        String sentence = "I don't know what to type 5 time, ";
        System.out.println(sentence);
        // I shall try loop hereunder (while) first
        int fiveTimes = 1;
        while (fiveTimes <= 5) {
            System.out.println(sentence);
            fiveTimes++;
        }

        // giving a try with (for) loop
        for (fiveTimes = 1; fiveTimes <= 5; fiveTimes++) {
            System.out.println(sentence);

         /* I have got an error it took me a while until I found out that I used comma instead of semicolon
            inside the phantasies of (for).
            */
        }

        // Day 2: 3/3


        System.out.println("  Bread is ready. \nWho is the bread for?");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        System.out.println("Noted: " + answer + " got bread.");

    }
}
