package Task1;

import java.util.Scanner;

public class Task7conditionals {
    public static void main(String[] args) {
        NotaNumberEntered();
    }

    public static void NotaNumberEntered() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int userNumber = scanner.nextInt();
            if (userNumber % 2 == 0) {
                System.out.println(userNumber + " is even.");
            } else {
                System.out.println(userNumber + " is odd.");
            }
        } catch (Exception e) {
            System.out.println("Only numbers can be entered. Please try again.");
            NotaNumberEntered();
        }
    }
}
