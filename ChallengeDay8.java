package com.challenge.homework;


/* I didn't understand this exercise at all neither what I am supposed to do.
Then after having seen this one hereunder, which was given at the class last week.
It looks alike so for-loop might be its tool.
*/

/*  Sem example: ChessForLoop
  public static void main(String[] args) {
            for (int height = 8; height >= 1; height--){
                for(int width = 1; width <= 8; width++){
                    System.out.print("("+height+", " + width+ ")");
                }
                System.out.println();
            }
        }
*/

import java.awt.*;
import java.util.Scanner;

public class ChallengeDay8 {
    public static void main(String[] args) {
        //LaunchWindow launchWindow = new LaunchWindow();
        Scanner input = new Scanner(System.in);
        System.out.println("You may provide the # of the target rows: ");
        int targetRow = input.nextInt();
        System.out.println("You may provide the # of the target column: ");
        int targetColumn = input.nextInt();

        /* Given that in the exercise:
         [The city is arranged in blocks, numbered like a chessboard]
         and Sem has demonstrated the number (8 -1)
         otherwise I would have used the default way both; = 1, and  <= input .
          */
        System.out.println("Deploy to: ");
        System.out.println("\u001B[35m"); //change COLOR

        for (int row = 8; row >= targetRow; row--) {
            for (int column = 1; column <= targetColumn; column++) {

                System.out.print("(" + row + ", " + column + ")");
            }
            System.out.println();
        }
        Toolkit playBeep = Toolkit.getDefaultToolkit();
        playBeep.beep();

        /* trying:
        System.out.println();
        System.out.println("Deploy to: ");
        for (int row = 1; row <= targetRow; row++) {
            for (int column = 1; column <= targetColumn; column++) {
                System.out.println();
                System.out.print("(" + row + ", " + column + ")");
            }
            System.out.println();
        } */
    }
}

