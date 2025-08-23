public class PowerOfNum {

    static int power(int p , int q){
        if(q==0 ) return  1;
        if(q==1 ) return  p;
        
        int res= power(p,q-1) *p;
        return  res;

    }
 public static void main(String[] args) {
    System.out.println(power(3, 3)); // Example: 2^3 = 8
    

 }
}
