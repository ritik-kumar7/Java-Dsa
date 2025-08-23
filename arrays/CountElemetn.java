public class CountElemetn {

    static  int countNum(int[]arr, int num){
        int count=0;
        for(int i=0; i<arr.length; i++ ){
            if(num==arr[i]){
                count++;
            }
        }
        return count;
    }
    
    static  int lastOuccer(int[]arr, int num){
        int lastIdx=0;
        for(int i=0; i<arr.length; i++ ){
            if(num==arr[i]){
                lastIdx=i;
            }
        }
        return lastIdx;
    }


    public static void main(String[] args) {
        int []arr={5,8};

        int number=3;
        System.out.println(countNum(arr, number));
        System.out.println(lastOuccer(arr, number));


    }
}
 