public class NumberAlphabetPattern {
    public static void main(String[] args) {
        int rows = 4;
        int num = 1;
        char ch = 'a';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " " + ch + " ");
                num++;
                ch++;
            }
            System.out.println();
        }
    }
}
