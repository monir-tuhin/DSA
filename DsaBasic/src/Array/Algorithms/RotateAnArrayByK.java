package Array.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class RotateAnArrayByK {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter no. of elements of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Please enter elements in array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Please enter k index");
        int k = sc.nextInt();
        int[] res = new int[n];
        int j=0;

        System.out.println("Original array before rotate::::::" + Arrays.toString(arr));

        for(int i=k;i<n;i++){
            res[j]=arr[i];
            j++;
        }

        for(int x=0;x<k;x++){
            res[j]=arr[x];
            j++;
        }

        System.out.println("Array after rotate in to left::::::" + Arrays.toString(res));

        /*for(int z=0;z<n;z++){
            System.out.print(res[z]+" ");
        }*/

        // in problem submission in codingninjas please undo this for loop for passing test cases and also comment out direction print

    }

}
