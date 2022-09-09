package mainnnn;

import java.util.*;

public class Main22 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        ArrayList<Integer> b = new ArrayList<>();
        LinkedList<Integer> c = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            a[i]= random.nextInt(0,2);
            b.add(random.nextInt(0,2));
            c.add(random.nextInt(0,2));
        }
        System.out.println(Arrays.toString(sort(a)));
        System.out.println(sort(b));
        System.out.println(sort(c));
    }

    public static int[] sort(int[] a) {
        Arrays.sort(a);
        return a;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> a) {
        Collections.sort(a);
        return a;
    }
    public static LinkedList<Integer> sort(LinkedList<Integer> a) {
        Collections.sort(a);
        return a;
    }
}
