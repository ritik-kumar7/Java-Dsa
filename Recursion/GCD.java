public class GCD {

    static int gcdBruitForce(int n, int k) {
        int min = Math.min(n, k); // smallest of the two
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && k % i == 0) {
                return i; // return first common divisor (largest)
            }
        }
        return 1; // default if no other common divisor found
    }

    public static void main(String[] args) {
        int result = gcdBruitForce(12, 16);
        System.out.println("GCD: " + result);
    }
}
