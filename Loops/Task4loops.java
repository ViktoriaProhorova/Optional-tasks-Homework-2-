package Loops;

import java.util.Scanner;

public class Task4loops {
    public static void main(String[] args) {
        checkIfNotaNumber();
    }
    public static void checkIfNotaNumber() {
        try {
            Scanner scanner = new Scanner(System.in);
            long factorial = 1;
            int userInputNumber;
            do {
                System.out.print("Please enter an integer from 1 to 9 to find a factorial: ");
                userInputNumber = scanner.nextInt();
                if (userInputNumber <= 0) {
                    System.out.println("Not a positive integer. Please try again.");
                }
                else if (userInputNumber >= 10) {
                    System.out.println("Integer should be from 1 to 9.");
                }
            } while (userInputNumber <= 0 || userInputNumber >= 10);

            for (int i = 1; i <= userInputNumber; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of the entered integer is " + factorial);
        } catch (Exception e) {
            System.out.println("Only integers can be entered. Please try again.");
            checkIfNotaNumber();
        }
    }
}
