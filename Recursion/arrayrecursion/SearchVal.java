package arrayrecursion;

public class SearchVal {
    static  int findVal(int arr[],int n,int val){
        if(n<0) return -1;

     

        if(val==arr[n]){
            return n;
        }

        return findVal(arr, n-1, val);
        
        
    }


    public static void main(String[] args) {
        int arr[]={3,4,2,44,23,11,10};

        int val=findVal(arr,arr.length-1,10);

        if(val==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at "+val);
        }

        System.out.println();
    }
    
}
