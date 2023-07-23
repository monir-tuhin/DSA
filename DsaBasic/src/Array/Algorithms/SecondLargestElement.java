package Array.Algorithms;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String args[]) {
        int arr[] = new int[]{-12, -10, -10, -6, -5};
        int secondLargestNum = findSecondLargest(arr.length, arr);
        System.out.println("2nd largest number in array::::::" + secondLargestNum);
    }

    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.

        /*Arrays.sort(arr);
        return arr[n - 2];*/ // it will not return correct answer always. when array elements are negative numbers then it will return wrong ans. Only returns correct answer when positive array elements

        Arrays.sort(arr);
        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                return arr[i];
            }
        }
        return -1; // If the second largest doesn't exist, you can handle it as per your requirement.
    };
}
