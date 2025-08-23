public class MultipleOfK {
    static int multiple(int n, int k){
        if(k==1 ) return  n;
        if(n==0) return  0;

        int res = n + multiple(n, k-1);
         return  res;


    }        
    public static void main(String[] args) {
        int n=3,k=5;
      for(int i=1; i<=k; i++){
        System.out.println(multiple(n, i) + " ");
         
      } // Example: 5 multiples of 3 = 15
        
    }
}
