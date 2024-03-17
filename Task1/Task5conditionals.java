package Task1;

import java.util.Scanner;

public class Task5conditionals {
    public static void main(String[] args) {
        ifNotaNumber();
    }

    public static void ifNotaNumber() {
        try {
            int firstNumber, secondNumber, thirdNumber, largest, temp;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            firstNumber = scanner.nextInt();
            System.out.print("Enter the second number: ");
            secondNumber = scanner.nextInt();
            System.out.print("Enter the third number: ");
            thirdNumber = scanner.nextInt();
            temp = firstNumber > secondNumber ? firstNumber : secondNumber;
            largest = thirdNumber > temp ? thirdNumber : temp;
            System.out.println("The largest number is: " + largest);
        } catch (Exception e) {
            System.out.println("You've entered incorrect value. Please try again.");
            ifNotaNumber();
        }
    }
}