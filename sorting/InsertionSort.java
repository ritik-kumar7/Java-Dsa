package  Sorting;
public class InsertionSort {

    //Print array function
    static  void printArray(int arr[]){
        if(arr.length==0){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //insertion Sort algo
    static  void  insertionSort(int arr[]){
        if(arr.length==0){
            return;
        }
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String args[]){
        int arr[]={3,1,7,4,9,5};

        System.out.println("Before Sorting the Array : ");
        printArray(arr);


        System.out.println("\nAfter Sorting the Array : ");
        insertionSort(arr);
        printArray(arr);

    }
}
