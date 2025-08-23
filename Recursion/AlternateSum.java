public class AlternateSum {
    
    static  int alternateSum(int n){
        if(n==1) return  1;
          
        
        int res1=0,res2=0;


        if(n%2==0){
            res1=  alternateSum(n-1)-n;
            
        }
        else{
            res2=alternateSum(n-1)+n;
        }

        return  (res1+res2);
      
    }

  public static void main(String[] args) {
    
    System.out.println(alternateSum(10));
  }  
}
