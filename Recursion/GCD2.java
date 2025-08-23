public class GCD2 {
    
    public static void main(String[] args) {
        int n=12,k=16;
    
        while(k%n!=0){
             int rem= k%n;
            n=k;
            k=rem;

        }
        System.out.println(k);
    }
}
