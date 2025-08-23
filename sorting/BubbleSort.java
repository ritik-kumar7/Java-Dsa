package Sorting;


public class BubbleSort{

    // Function to print array
    static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Bubble sort implementation
    static void bubbleSort(int arr[]) {
        if (arr.length == 0) {
            return;
        }
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int swap = 0;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            if (swap == 0) {
                System.out.println("Array is sorted.");
                break;
            } else {
                System.out.println("Number of swaps in pass " + (i + 1) + ": " + swap);
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
 {
    
}
