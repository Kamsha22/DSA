import java.util.Scanner;

public class StepSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            B[i] = A[i];
        }


        System.out.println("\nInsertion Sort Steps (Ascending):");
        insertionSort(A, true);


        System.out.println("\nInsertion Sort Steps (Descending):");
        insertionSort(B, false);


        System.out.print("\nFinal Sorted Array (Ascending): ");
        printArray(A);
        System.out.print("Final Sorted Array (Descending): ");
        printArray(B);


    }

    private static void insertionSort(int[] arr, boolean ascending) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i], j = i - 1;
            System.out.println("Step " + i + ": Inserting " + key);

            while (j >= 0 && ((ascending && arr[j] > key) || (!ascending && arr[j] < key))) {
                arr[j + 1] = arr[j];
                j--;
                printArray(arr);
            }

            arr[j + 1] = key;
            printArray(arr);
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
