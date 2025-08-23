package arrayrecursion;

public class MaxVal {

    static  int maxVal(int[] arr,int n){

        if(n==0) return arr[0];

        int maxFromRest=maxVal(arr, n-1);

        if(arr[n]>maxFromRest){
            return arr[n];
        }
        else{
            return maxFromRest;
        }
        
    }
    public static void main(String []args){
        int arr[]={1,3,4,13,44,14,10,8};

        System.out.println(maxVal(arr,arr.length-1));

        
    }
}
