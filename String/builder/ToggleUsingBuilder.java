package builder;

public class ToggleUsingBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mello wORld");

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.setCharAt(i, (char)(ch - 32)); // To uppercase
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.setCharAt(i, (char)(ch + 32)); // To lowercase
            }
        }

        System.out.println(sb);
    }
}
