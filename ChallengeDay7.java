package com.challenge.homework;

import java.util.Scanner;

public class ChallengeDay7 {
    public static void main(String[] args) {
        introMessage();
        Scanner input = new Scanner(System.in);
        int inputEstate = input.nextInt();
        int inputDuchy = input.nextInt();
        int inputProvince = input.nextInt();
        int sum = pointS(inputEstate, inputDuchy, inputProvince);
        System.out.println("By giving 1 point per estate, 3 per duchy, and 6 per province, your point total is: " + sum + ". ");

    }

    public static void introMessage() {
        System.out.println("💡Respectively, please enter the number of ⤵\n" + "1️⃣ Estates (Firstly)  \n" + "2️⃣ Duchies (Secondly) \n" + "3️⃣ Provinces (Lastly): ");
    }

    public static int pointS(int estate, int duchy, int province) {
        return estate + (duchy * 3) + (province * 6);
    }

}
