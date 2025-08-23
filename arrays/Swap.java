public class Swap {

    public static void printArray(int arr[]) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    static void swapArr(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swapArr(arr, start, end);
            start++;
            end--;
        }
    }

    static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        if (k < 0) k += n; // handle negative k

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 2, 8, 1};
        printArray(arr);
        System.out.println();

        rotateArray(arr, 3);
        printArray(arr);
    }
}