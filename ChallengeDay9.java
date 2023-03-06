package com.challenge.homework;

import java.util.Scanner;

/*
What are Even Numbers in Math?
These numbers when divided by 2 leave 0 as the remainder.
You can check for this using: num % 2 == 0.
 */
public class ChallengeDay9 {
    public static void main(String[] args){
        System.out.println("Check ⤵");
        Scanner checkNum = new Scanner(System.in);
        int userNum = checkNum.nextInt();
        if(userNum % 2 == 0 ) {
            System.out.println("Tick");
        }
        else {
            System.out.println("Tock");
        }

    }
}
