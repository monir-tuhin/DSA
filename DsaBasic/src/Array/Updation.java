package Array;

public class Updation {
    public static void main(String args[]) {
        int age[] = new int[]{18,20,25,44,28};
        int pos = 2, item = 50;
        System.out.println("Given arrays::::::::: ");

        for (int i=0; i<age.length; i++) {
            System.out.println("index & value: "+ i + " = " +age[i]);
        }

        age[pos] = item; // position 2 updated by item:50;

        System.out.println("Given arrays after Updated::::::::: ");

        for (int i=0; i<age.length; i++) {
            System.out.println("index & value: "+ i + " = " +age[i]);
        }

    }
}
