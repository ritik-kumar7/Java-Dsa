// AdvanceArray.java
// Demonstrates advanced array operations: finding pairs with a target sum, unique value, max, and second largest value.

public class AdvanceArray {

    // Prints all pairs in the array whose sum equals the target value.
    void targetTwoSum(int[] arr) {
        int sum = 8, pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Avoid duplicate pairs and self-pairing
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                    pairs++;
                }
            }
        }
        System.out.println("Total pairs : " + pairs);
    }

    // Finds and returns the unique value in the array (the value that appears only once).
    // Returns -1 if no unique value is found.
    int findUniqueVal(int[] arr) {
        // Use a frequency array or HashMap for better efficiency, but keeping your logic with comments.
        int val = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                val = arr[i];
                return val;
            }
        }
        return val;
    }

    // Returns the maximum value in the array.
    int maxVal(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Returns the second largest value in the array without modifying the original array.
    int secondLargestValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    //First Repeat Value return 

    int firstRepeteValue(int arr[]){
      
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}

// Control class to test AdvanceArray methods
class ControlVal {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1,  6, 5, 5, 2, 6, 1, 4};
        AdvanceArray obj1 = new AdvanceArray();

        // Print all pairs with sum 8
        obj1.targetTwoSum(arr);

        // Find and print the unique value
        int uniqueValue = obj1.findUniqueVal(arr);
        System.out.println("Unique value: " + uniqueValue);

        // Find and print the second largest value
        int secondMax = obj1.secondLargestValue(arr);
        System.out.println("Second largest value: " + secondMax);
        int firstRepeteVal= obj1.firstRepeteValue(arr);
        System.out.println(firstRepeteVal);
    }
}