package Sorting;

public class SelectionSort {

    static  void  printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
       
    }

   static void selectionSort(int arr[]) {
    int len = arr.length;
    for (int i = 0; i < len - 1; i++) {
        int minIndex = i; // assume current is min
        for (int j = i + 1; j < len; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j; // update min index
            }
        }
        // swap after finding the smallest
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

    public static void main(String[] args) {
        
        int arr[]={3,2,5,1,8,4};

        System.out.println("Before Sorting Array ");
        printArray(arr);

        selectionSort(arr);
        System.out.println("\nAfter Sorting Array");
        printArray(arr);
    }


    
}
