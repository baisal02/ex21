import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            a.add(random.nextInt(0, 100));
        }
        System.out.println(a);
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int c = random.nextInt(0, 98);
            if (c%2==0) {
                array1.add(c);
            }
            else {
                array2.add(c);
            }
        }
        System.out.println(array1);
        System.out.println(array2);


    }
}