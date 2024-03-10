package Task1;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter random number: ");
        int userInput = scanner.nextInt();
        if (userInput > 10) {
            System.out.println("Number greater than 10.");
        } else if (userInput < 10) {
            System.out.println("Number less than 10.");
        }
        else {
            System.out.println("You've entered 10.");
        }
    }
}
