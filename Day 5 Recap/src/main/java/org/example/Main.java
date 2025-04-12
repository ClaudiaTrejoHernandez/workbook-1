package org.example;
import java.util.Scanner;

import java.nio.file.attribute.UserPrincipal;

public class Main {
    public static void main(String[] args) {


//        //Examples of scanner usage here
//        Scanner read = new Scanner(System.in);
//
//        System.out.println("Enter the Saiyan name: ");
//        String name = read.nextLine();
//        System.out.println("Enter power level: ");
//        int powerlevel = read.nextInt();

        //An instance (a copy, a version) of a Saiyan
        Saiyan mySaiyan = new Saiyan("Remzoku", 8000, 100);
        Saiyan enemySaiyan = new Saiyan("Frieza", 10000, 2000);

        mySaiyan.displayInfo();
        mySaiyan.train();
        mySaiyan.displayInfo();
        System.out.println();
        mySaiyan.transform();
        System.out.println();
        enemySaiyan.displayInfo();
        System.out.println();
        mySaiyan.blast(enemySaiyan);
        System.out.println();
        mySaiyan.displayInfo();
        System.out.println();
        enemySaiyan.displayInfo();
        System.out.println();
        mySaiyan.compareStrength(enemySaiyan);

        //Instantiation of an object (copy)
        Saiyan goku = new Saiyan("Goku", 900000, 10000);


        //Explanation on how to use the Math.max that is in class Helper.java
        float damage = 19.254123f;
        Helper.showTwoDecimals(damage);

        // Math.M
        // Which Saiyan is stronger?

    }

}