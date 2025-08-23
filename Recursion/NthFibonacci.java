public class NthFibonacci {
    static int fibo(int n){
        if(n==1 || n==0){
            return  n;
        }
      

        int ans = fibo(n-1)+ fibo(n-2);
        return ans;
    }
    public static void main(String[] args) {

      for(int i=0; i<=10; i++){
        System.out.print(fibo(i)+" ");
      }

    }
}
