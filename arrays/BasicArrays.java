

public class BasicArrays {

    int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    int maxVal(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int searchVal(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    boolean checkSortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    int[] minMax(int[] arr){
       
      int[] values=new int[2];
      values[0]=arr[0];
      values[1]=arr[0];
      for(int i=1; i<arr.length;i++){
            if(arr[i]<values[0]){

                 values[0]=arr[i];
            }
              if(arr[i]>values[1]){

                 values[1]=arr[i];
            }
      }
              return values;
    }
}

class Main {

    public static void main(String[] args) {
        BasicArrays arr = new BasicArrays();
        int numbers[] = {2, 3, 4, 5, 5,15,-4,57, 8, 9};
        int res = arr.sumOfArray(numbers);
        System.out.println(res);

        int max = arr.maxVal(numbers);
        System.out.println(max);

        int val = 8;
        int found = arr.searchVal(numbers, val);
        if (found == -1) {
            System.out.println("Value not found in current array ");
        } else {
            System.out.println("Element found at index no. : " + found);
        }

        boolean arrCheck = arr.checkSortedArray(numbers);
        System.out.println("is sorted array : "+arrCheck);
   
        int[] smallestLargest=arr.minMax(numbers);
        System.out.println("smaltes value is : "+smallestLargest[0]+" and largets value is : "+smallestLargest[1]);
    }
}