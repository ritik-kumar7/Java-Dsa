public class MultipleOfK2 {
    static void multiple(int n, int k){
        if(k==1 ) {
            System.out.println(n);
            return;
        }
         
        

        multiple(n, k-1);
        System.out.println(n * k + " ");
         


    }        
    public static void main(String[] args) {
       multiple(4, 10);
        
    }
}
