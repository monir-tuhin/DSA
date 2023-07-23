package Array;

public class Insertion {
    public static void main(String args[]) {
        int age[] = new int[5];

        System.out.println("Before Insertion Array");
        for (int i=0; i<5; i++)
            System.out.println("index["+i+"] =" + age[i]);

        System.out.println("After Insertion Array");
        for (int i=0; i<5; i++) {
            age[i] = i+5;
            System.out.println("index["+i+"] =" + age[i]);
        }
    }
}
