package Sorting;

public class SelectionSortDecending {

    static  void  printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
       
    }


static void selectionSortDescending(int arr[]) {
    int len = arr.length;
    for (int i = 0; i < len - 1; i++) {
        int maxIndex = i;
        for (int j = i + 1; j < len; j++) {
            if (arr[j] > arr[maxIndex]) {
                maxIndex = j;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[i];
        arr[i] = temp;
    }
}


    public static void main(String[] args) {
        
        int arr[]={3,2,5,1,8,4};

        System.out.println("Before Sorting Array ");
        printArray(arr);

        selectionSortDescending(arr);
        System.out.println("\nAfter Sorting Array");
        printArray(arr);
    }


    
}
