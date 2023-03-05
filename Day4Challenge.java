package com.challenge.homework;

import java.util.Scanner;

public class Day4Challenge {
    public static void main(String[] args) {
        int x = 424_242;
        byte bt = 100;
        short s = 20_020;
        long l = 1_234_567_890;
        float f = 3.145f;
        double d = 3.13457599923384753929348D;
        boolean b = true;
        char c = 'a';

        // and the text type hereunder
        String primitive = " int x = 424_242\n" + " byte bt = 100\n" + " short s = 20_020\n" + " long l = 1_234_567_890\n" + " float f = 3.145f\n" + " double d = 3.13457599923384753929348D\n" + " boolean b = true\n" + " char c = 'a'.";
        System.out.println(primitive);


        /* Day 5: 2/2-Challenge
        - The Triangle Farmer */

        // (Area = base x height / 2)

        System.out.println(); // new line

        System.out.println("Please enter the Base and the Height respectively: ");
        Scanner baseUser = new Scanner(System.in);
        double base = baseUser.nextDouble();
        Scanner heightUser = new Scanner(System.in);
        double height = heightUser.nextDouble();
        double area = (base * height) / 2;
        System.out.println("The Area is: " + area + " sq.m");

        /* in error: I've made two scanners
        While: only one scanner was needed by which I can instantiate the base and height (.)
         */

        System.out.println("Please enter the Base and the Height respectively: ");
        Scanner byUser = new Scanner(System.in);
        double baseAgain = byUser.nextDouble();
        double heightAgain = byUser.nextDouble();
        double areaAgain = (baseAgain * heightAgain) / 2 ;
        System.out.println(areaAgain + " sq.m");

        /* Probably it was not a MISTAKE to make 2 scanners as I found out both of the code above WORK
        in ERROR: I can only use (,) not (.) for decimoles.
         */

    }
}
