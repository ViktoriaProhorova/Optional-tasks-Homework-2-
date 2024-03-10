package Task1;

import java.util.Scanner;

public class Task2conditionals {
    public static void main(String[] args) {
        checker();
    }
    public static void checker() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter first number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Please enter second number: ");
            int secondNumber = scanner.nextInt();
            if (firstNumber > secondNumber) {
                System.out.printf("%d greater than %d", firstNumber, secondNumber);
            }
            if (firstNumber < secondNumber) {
                System.out.printf("%d less than %d", firstNumber, secondNumber);
            }
            if (firstNumber == secondNumber) {
                System.out.printf("%d equals to %d", firstNumber, secondNumber);
            }
        } catch (Exception e) {
            System.out.println("You've entered incorrect value. Please try again : ");
            checker();
        }
    }
}