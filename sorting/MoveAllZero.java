package Sorting;

public class  MoveAllZero{

    static  void moveZeros(int arr[]){
        if(arr.length==0) return;

        for(int i=0; i<arr.length-1; i++){
            for(int j=0 ; j<arr.length-i-1; j++){
                if(arr[j]==0 && arr[j+1] != 0){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,0,4,9,0,6,1,0,5};
         System.out.println("Before move zeros :");
        SelectionSort.printArray(arr);

        moveZeros(arr);
System.out.println("\n After Move zeros : ");
        SelectionSort.printArray(arr);
    }
}

