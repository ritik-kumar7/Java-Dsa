public class SortZeroOne {

    static  void sortValues(int []arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i= 0; i<arr.length; i++){
           if(i<count){
            arr[i]=0;
           }
           else{
            arr[i]=1;
           }
        }


     
    }
        
        static void swapVal(int []arr,int left,int right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }

           static  void sortZeors(int arr[]){
            int left =0;
            int right=arr.length-1;
while (left < right) {
    if (arr[left] == 1 && arr[right] == 0) {
        swapVal(arr, left, right);
        left++;
        right--;
    } else if (arr[left] == 0) {
        left++;
    } else if (arr[right] == 1) {
        right--;
    }
}
        }

       


           public static void main(String[] args) {
        int []arr={1,1,0,1,0,0,1,1};
            Swap obj=new  Swap();
           obj.printArray(arr);

           sortZeors(arr);
           System.out.println();
           obj.printArray(arr);
    }
    }
 

