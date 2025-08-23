public class SumOfSeries {
    public static void main(String[] args) {
        
        int n=10;
        // int odd=0,even=0;

        // for(int i=1; i<=n; i++){
        //     if(i%2==0){
        //         even -= i;
        //     }
        //     else{
        //         odd +=i;
        //     }
        // }
        // System.out.println(even+odd);

        int res=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                res -=i;
            }
            else{
                res+=i;
            }
        }
        System.out.println(res);
    }
}
