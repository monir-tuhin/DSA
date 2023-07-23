package Array;

public class Deletion {
    public static void main(String args[]) {
        int age[] = new int[]{18,20,25,44,28};
        int n = 5;
        int di = 2; // delete index

        System.out.println("Given arrays::::::::: ");

        for (int i=0; i<n; i++) {
            System.out.println("index & value: "+ i + " = " +age[i]);
        }

//        delete an element from the array
        while (di < n-1) {
            age[di] =age[di+1];
            di = di+1;
        }
        n = n-1;

        System.out.println("Print arrays after deletion::::::::: ");
        for (int i=0; i<n; i++) {
            System.out.println("index & value: "+ i + " = " +age[i]);
        }

    }
}
