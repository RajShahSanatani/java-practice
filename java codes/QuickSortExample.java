import java.util.*;
public class QuickSortExample {

    // Swap helper
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition function
    static int partition(int[] arr, int start, int end) {
        int piv = arr[start];   // choose first element as pivot
        int low = start;
        int high = end;

        while (low < high) {
            while (low <= end && arr[low] <= piv) {
                low++;
            }
            while (high >= start && arr[high] > piv) {
                high--;
            }

            if (low < high) {
                swap(arr, low, high); // Swap misplaced elements
            }
        }

        swap(arr, start, high);  // Place pivot at correct position
        return high;             // Return pivot index
    }

    // Quicksort function
    static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int pivInd = partition(arr, start, end);  // Find pivot index
            quicksort(arr, start, pivInd - 1);        // Left subarray
            quicksort(arr, pivInd + 1, end);          // Right subarray
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {24, 9, 29, 14, 19, 27};

        System.out.print("Before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        quicksort(arr, 0, arr.length - 1);

        System.out.print("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}