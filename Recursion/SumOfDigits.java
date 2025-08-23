public class SumOfDigits {

    static int sumOfDigits(int n) {

           if( n>=0 && n<=9) return  n;

        int res = n%10 + sumOfDigits(n/10);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(2103));
        

    }
}
