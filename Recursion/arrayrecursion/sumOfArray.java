package arrayrecursion;

public class sumOfArray {

    static  int sumArray(int arr[],int n ){ 
        if(n==0) return  arr[0];

        int res= arr[n] + sumArray(arr, n-1);

        return  res;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,3,4};

        System.out.println(sumArray(arr,arr.length-1));
    }
}
