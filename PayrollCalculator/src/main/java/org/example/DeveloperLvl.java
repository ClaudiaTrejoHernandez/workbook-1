package org.example;
import java.util.Scanner;

public class DeveloperLvl {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter your years of experience: ");
        int yearsOfexp = read.nextInt();
        System.out.println("Enter the number of programming languages you know: ");
        int languages = read.nextInt();

        if (yearsOfexp > 5 && languages > 3){
            System.out.println("You are a senior developer! Whoop whoop!!");
        }else if (yearsOfexp >= 2 && yearsOfexp <= 5 && languages >= 2){
            System.out.println("You are a median developer! Medium Whoop!");
        }else if (yearsOfexp < 2 || languages < 2){
            System.out.println("You're a junior developer. Small Whoop!");
        }else{
            System.out.println("Developer level is not clear. Please try again.");
        }
        read.close();
    }
}
