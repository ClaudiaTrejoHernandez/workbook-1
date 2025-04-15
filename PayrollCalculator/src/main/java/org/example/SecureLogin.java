package org.example;
import java.util.Scanner;

public class SecureLogin {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Enter your Username: ");
        String userName = read.next();

        System.out.println("Enter your Password: ");
        String password = read.next();

        if (!userName.isEmpty() && !(!password.equals("secret123"))){
            System.out.println("Access granted, welcome " + userName);
        }else{
            System.out.println("Access denied - invalid credentials.");
        }
    }
}
