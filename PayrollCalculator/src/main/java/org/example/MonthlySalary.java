package org.example;
import java.util.Scanner;

public class MonthlySalary {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//
        System.out.println("Enter your monthly salary: ");
        int salary = read.nextInt();

//        int salary = 2000;
//        int yearsOfexperience = 2;

//        if (salary < 2000 || yearsOfexperience < 3){
//            System.out.println("You are a junior developer. Still growing!");
//        }
        if (salary == 10000) {
            System.out.println("This is what I'm talking about!!");
        } else if (salary > 5000) {
            System.out.println("Now we're talking!");
        } else if (salary > 2000) {
            System.out.println("Just getting started..");
        } else if (salary < 1000) {
            System.out.println("I want to earn more ._.");
        } else {
            System.out.println("Gotta get to it!");
        }

        if (salary > 10000) {
            int difference = 10000 - salary;
            System.out.println("You need to earn $" + difference + "more to reach $10,000.");
        }else {
            System.out.println("Great job! You've reached or already surpassed $10,000!!!");
        }
        read.close();
    }
}
