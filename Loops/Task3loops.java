package Loops;

import java.util.Scanner;

public class Task3loops {
    public static void main(String[] args) {
        notAnumber();
    }

    public static void notAnumber() {
        try {
            Scanner scanner = new Scanner(System.in);
            int userInput, firstTerm = 1, secondTerm = 1, nextTerm = 0;
            System.out.print("Please enter a number from 1 to 41: ");
            userInput = scanner.nextInt();
            if (userInput == 1 || userInput == 2) {
                System.out.println("1 in Fibonacci series");
            } else if (userInput > 41) {
                System.out.println("Number should be from 1 to 41.");
            } else {
                for (int i = 2; i < userInput; i++) {
                    nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }
                System.out.println(nextTerm + " in Fibonacci series");
            }
        } catch (Exception e) {
            System.out.println("Only numbers can be entered. Please try again.");
            notAnumber();
        }
    }
}

