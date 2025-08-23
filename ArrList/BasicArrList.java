import  java.util.*;

public class BasicArrList {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(4);
        li.add(2);
        li.add(9);
        System.out.println(li);
        Collections.reverse(li);
        System.out.println(li);
        Collections.sort(li);


    }
}
