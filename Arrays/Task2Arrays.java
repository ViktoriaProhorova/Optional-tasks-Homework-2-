package Arrays;

public class Task2Arrays {
    public static void main(String[] args) {
        int arr[] = { 126, 6, -15, 0, 4, 7, -85, 55, 345, -1234 };
        int evenIndexes = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                evenIndexes += arr[i];
        }

        System.out.println("Sum of elements with even indexes: " + evenIndexes);
    }
}
