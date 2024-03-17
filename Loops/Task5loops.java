package Loops;


import java.util.Scanner;

public class Task5loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter random text: ");
        String userString = scanner.nextLine();

        for (int i = 0; i < userString.length(); i++) {
            System.out.println(userString.charAt(i));
        }
    }
}
