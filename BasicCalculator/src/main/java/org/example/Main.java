package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Step 1
        Scanner read = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = read.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = read.nextInt();

        read.nextLine();

        System.out.println("Possible calculations:\n(A)dd\n(S)ubtract\n(M)ultiply)\n(D)ivide\nPlease type in the () letter to choose your calculation: ");
        String calculation = read.nextLine();
        System.out.println("You chose: " + calculation);

        //Calculations
        if (calculation.equals("A")) {
            int sum = num1 + num2;
            System.out.println("The sum is " + sum);
        }

        else if (calculation.equals("M")) {
            int product = num1 * num2;
            System.out.println("The product is " + product);
        }

        else if (calculation.equals("D")) {
            if (num2 != 0) {
                double quotient = (double) num1 / num2;
                System.out.println("The quotient is " + quotient);
            }

            else {
                System.out.println("Can't divide by zero!");
            }
        }

        else {
            System.out.println("Invalid input!");
        }
    }
}
