public class Sumdigit{
    public static void main(String[] args) {
        int num=23442;
        int res =0;
        while (num>0) {
           // modules give last digit of number 
            res += num%10;
            num =num/10;
            
        }
        System.out.println(res);
    }
}
