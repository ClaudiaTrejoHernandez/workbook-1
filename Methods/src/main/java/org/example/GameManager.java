package org.example;

public class GameManager {

    public static void exitGame(){

        System.out.println("Thanks for playing! Exiting game");
        System.exit(0); // Close the program

        // 0 = Running the exit command without any errors
        // 1 = Some error has occurred in the code, and you want to exit the program
    }
    public static void exitWithError(String message){
        System.err.println("Error" + message);
        System.exit(1); // Abrupt ending of the program
    }
}
