package Arrays;

public class Task1Arrays {
    public static void main(String[] args) {
        int positiveCount, negativeCount, zeroCount;
        positiveCount = negativeCount = zeroCount = 0;
        int myArray[] = {4, 8, -2, 32, -1, 0, 7, 0, -9};

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) {
                positiveCount++;
            } else if (myArray[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Count of positive numbers in array: " + positiveCount);
        System.out.println("Count of negative numbers in array: " + negativeCount);
        System.out.println("Count of zeroes in array: " + zeroCount);
    }
}