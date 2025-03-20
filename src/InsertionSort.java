import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] A = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int j = 0; j < n; j++) {
            A[j] = input.nextInt();
        }


        int shiftCount = 0;

        for (int j = 1; j < n; j++) {
            int key = A[j];
            int i = j - 1;

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
                shiftCount++;
            }
            A[i + 1] = key;
        }


        System.out.print("Sorted array (ascending): ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }


        System.out.print("\nSorted array (descending): ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }


        System.out.println("\nTotal number of shifts: " + shiftCount);


    }
}
