public class ReverseTheDigit {
    public static void main(String[] args) {
        int digit=2347;

        int res, reverceDigit=0;

        while (digit>0) {
            res= digit%10;
            reverceDigit = reverceDigit * 10+res;
            digit =digit/10;
              
        }
        System.out.println("reverce digit is "+ reverceDigit);
    }
}
