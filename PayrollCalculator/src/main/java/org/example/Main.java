package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Step 1
        Scanner read = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = read.nextLine();

        System.out.println("Enter your hour's worked: ");
        float hoursWorked = read.nextFloat();

        System.out.println("Enter your hourly pay rate: ");
        float hourlyRate = read.nextFloat();

        float regularPay;
        double overtimePay= 0;
        float grossPay;

        if (hoursWorked <= 40) {
            // No overtime
            regularPay = hoursWorked * hourlyRate;
        }

        else {
            // Regular pay + overtime pay
            regularPay = 40 * hourlyRate;
            double overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * 1.5;
        }

        //Total gross pay (will include regular and overtime pay)
        grossPay = (float) (regularPay + overtimePay);

        // Final output for user
        System.out.println("Employee name: " + name);
        System.out.printf("Regular Pay: $%.2f\n", regularPay);
        System.out.printf("Overtime Pay: $%.2f\n", overtimePay);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);

    }
}