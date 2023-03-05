package com.challenge.homework;
import java.util.Scanner;
public class Day6_Challenge {
    public static void main(String[] args){
        System.out.println("Please enter the number of chocolate eggs gathered today: ");
        Scanner dailyEggs = new Scanner(System.in);
        int perDay = dailyEggs.nextInt();
        int forEachSis = perDay / 4 ;
        System.out.println("Each of the sisters would get:  " + forEachSis + " Eggs.");
        int duckbearLeftOver = perDay % 4 ;
        System.out.println("So " + duckbearLeftOver + " total egg for the Duckbear.");

        // System.out.println(duckbearLeftOver > forEachSis);

        /* I've just searched for the largest remainder number in Java:
         int largestRemainder = c % ((c/2) + 1);
          */

        /*int c = 4;
        int largestRemainder = c % ((c/2) + 1);
        System.out.println(largestRemainder);
         */


        System.out.println("The three total egg counts that the duckbear gets more than each sister are: ");
        int number, leftOver, oneSister;
        for (number = 1; number <= 100; number++) {
            leftOver = number % 4;
            oneSister = number / 4;

            if (leftOver == 3 && oneSister < leftOver) {
                System.out.println(number);
                //  3, 7 and 11
            }
        }


    }
}
