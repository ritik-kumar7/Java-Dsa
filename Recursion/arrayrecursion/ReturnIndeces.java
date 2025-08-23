package arrayrecursion;

import java.util.ArrayList;

public class ReturnIndeces {

    static ArrayList<Integer> findIndeces(int arr[],int n, int val,ArrayList<Integer> newArr){



        if(n<0) return newArr;


        if(arr[n]==val){
            newArr.add(n);
        }

        return  findIndeces(arr, n-1, val,newArr);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList();
        ArrayList<Integer> newArr= new ArrayList();
          int []arr2={3,3,4,10,38,10,4,10,32};

        newArr=findIndeces(arr2,arr2.length-1, 10,arr);

        System.out.println(newArr);
    }
}
