package Array;

public class Traversal {
    public static void main(String args[]) {
     /*
      // 1st way
      //Creating an array
        int age[] = new int[7];
        //Populating the array
        age[0] = 1254;
        age[1] = 1458;
        age[2] = 5687;
        age[3] = 1457;
        age[4] = 4554;
        age[5] = 5445;
        age[6] = 7524;*/

        // 2nd way
        int age[] = new int[]{1254, 1458, 5687, 1457, 4554, 5445};

        //Printing Contents using for loop
        System.out.println("Contents of the array: ");
        for(int i=0; i<age.length; i++) {
            System.out.println(age[i]);
        }
    }
}
