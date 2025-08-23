
import java.util.Scanner;

public class ProfitLoss {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cost price :  ");
        int cp=sc.nextInt();
            System.out.print("Enter sell price :  ");
        int sp=sc.nextInt();
        if(cp>sp){
            int loss=cp-sp;
            System.out.println("loss "+loss);
        }
        else if(sp>cp){
            int profit=sp-cp;
            System.out.println("profit "+profit);
        }
        else{
            System.out.println("no profit or loss");
        }
    }
}
