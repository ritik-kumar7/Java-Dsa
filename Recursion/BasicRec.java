public class BasicRec{

    static  void printNum(int a){
        
        if(a==1)
        { 
           System.out.println(a); 
        return;
        }

printNum(a-1);

System.out.println(a);
       
   }
    public static void main(String[] args) {
       printNum(10);
        
    }
}