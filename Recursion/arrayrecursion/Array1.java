package arrayrecursion;

public class Array1 {

    static void printArray(int []arr,int n){

        if(n<0) return;

        printArray(arr, n-1);
        System.out.println(arr[n]);
    }


    static int maxElement(int []arr,int n){ 
          if(n<0) return arr[0];
           int a=arr[0];

           if(arr[n]>a){
            a=arr[n];
           }
    }


    public static void main(String[] args) {
        int []arr={3,4,2,3};

        printArray(arr,arr.length-1);
        

    }
}
