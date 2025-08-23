package arrayrecursion;

public class PrintIndeces {
    static  void printIndeces(int arr[],int n,int val){
        if(n<0)  return;

         

        if(val==arr[n]){
            System.out.println(n);
        }

         printIndeces(arr, n-1, val);

        
        
        
    }


    public static void main(String[] args) {
        int arr[]={3,10,2,44,10,23,11,10};

        printIndeces(arr,arr.length-1,10);

     

        System.out.println();
    }
    
}

