package Loops;

import java.util.Scanner;

public class Task2loops {
    public static void main(String[] args) {
        ifSomethingElseEntered();
    }
    public static void ifSomethingElseEntered() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a positive number: ");
            int userInput = scanner.nextInt();
            if (userInput <= 0) {
                System.out.println("Not a positive number.");
            }
            for (int i = 0; i < userInput; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            System.out.println("Only numbers can be entered. Please try again.");
            ifSomethingElseEntered();
        }
    }
}
