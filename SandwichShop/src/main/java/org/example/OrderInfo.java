package org.example;
import java.util.Scanner;

public class OrderInfo {

    public static void size() {
        Scanner read = new Scanner(System.in);

        System.out.println("Select your sandwich size: 1 = Regular, 2 = Large");
        int command = read.nextInt();

        if (command == 1) {
            double price = 5.45;
            doRegular(read, price);
        } else if (command == 2) {
            double price = 8.95;
            doLarge(read, price);
        } else {
            System.out.println("Sandwich size invalid!");
        }
    }

    public static void doRegular(Scanner read, double price) {
        System.out.println("You chose to have a Regular Sandwich.\nWhat is your age? ");
        int age = read.nextInt();

        if (age <= 17) {
            double totalYouthPrice = price - (price * .10);
            System.out.printf("Your total price comes out to: $%.2f", totalYouthPrice);
        } else if (age >= 65) {
            double totalSeniorPrice = price - (price * .20);
            System.out.printf("Your total price comes out to: $%.2f", totalSeniorPrice);
        } else {
            double noDiscount = price;
            System.out.printf("Sorry, no discount for you :( Your total price is: $%.2f", noDiscount);
        }
    }

    public static void doLarge(Scanner read, double price) {
        System.out.println("You chose to have a Large Sandwich.\nWhat is your age? ");
        int age = read.nextInt();

        if (age <= 17) {
            double totalYouthPrice = price - (price * .10);
            System.out.printf("Your total price comes out to: $%.2f", totalYouthPrice);
        } else if (age >= 65) {
            double totalSeniorPrice = price - (price * .20);
            System.out.printf("Your total price comes out to: $%.2f", totalSeniorPrice);
        }
        else {
            double noDiscount = price;
            System.out.printf("Sorry, no discount for you :( Your total price is: $%.2f", noDiscount);

        }
    }
}