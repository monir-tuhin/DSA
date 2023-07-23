package Array;

import java.util.Scanner;

public class Searching {
    public static void main(String args[]) {
        int age[] = new int[]{18,20,25,44,28};
        int i;

        System.out.println("Please input a value to search an array..........");
        Scanner scanner = new Scanner(System.in);
        int scanValue = scanner.nextInt();

        for (i=0; i<age.length; i++) {
            if (age[i] == scanValue) {
                System.out.println("Item found at index of: " + i);
                break;
            }
        }

        if (i == age.length) System.out.println("Item not found !");

    }
}
