package Task1;

import java.util.Scanner;

public class Task3conditionals {
    public static void main(String[] args) {
            numberOrNot();
        }
        public static void numberOrNot() {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Please enter first side length: ");
                int side1 = scanner.nextInt();
                System.out.print("Please enter second side length: ");
                int side2 = scanner.nextInt();
                System.out.print("Please enter third side length: ");
                int side3 = scanner.nextInt();
                if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1
                || side1 == 0 || side2 == 0 || side3 == 0) {
                    System.out.println("Not a triangle!");
                } else {
                    if (side1 == side2 && side2 == side3) {
                        System.out.println("Triangle is equilateral!");
                    } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                        System.out.println("Triangle is isosceles!");
                    } else {
                        System.out.println("Triangle is scalene!");
                    }
                }
            } catch (Exception e) {
                System.out.println("You've entered incorrect value. Please try again.");
                numberOrNot();
            }
        }
    }
