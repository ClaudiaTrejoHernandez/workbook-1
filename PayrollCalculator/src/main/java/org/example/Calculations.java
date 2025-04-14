package org.example;

import java.util.Scanner;

public class Calculations {
    static Scanner read = new Scanner(System.in);
    static String name;
    static float hoursWorked;
    static float hourlyRate;

    public static void data(){
        System.out.println("Enter your name: ");
        name = read.nextLine();
        System.out.println("How many hours did you work? ");
        hoursWorked = read.nextFloat();
        System.out.println("What is your hourly rate? ");
        hourlyRate = read.nextFloat();
    }

    // Static; No Overtime
    public static void noOvertime() {
        float regularPay = hoursWorked * hourlyRate;
        System.out.println(name + ", your regular pay (no overtime) is: " + regularPay);
    }

    // Static method: With Overtime
    public static void yesOvertime() {
        float regularPay = 40 * hourlyRate;
        float overtimeHours = hoursWorked - 40;
        double overtimePay = overtimeHours * hourlyRate * 1.5;
        float grossPay = (float)(regularPay + overtimePay);
        System.out.println(name + ", your gross pay with overtime is: $" + grossPay);
    }
}



