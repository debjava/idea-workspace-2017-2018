package com.ddlab.algol.completed;

/**
 * Created by PIKU on 9/17/2015.
 */
public class FindSecondLargest {

//    http://www.programcreek.com/2014/05/leetcode-kth-largest-element-in-an-array-java/

    public static void findSecondLargest(int[] a) {
        int largest = a[0];
        int secondLargest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest) {
                secondLargest = a[i];
            }
        }
        System.out.println("Second Largest :::" + secondLargest);
    }

    public static void main(String[] args) {
        int arr[] = {1, 23, 47, 81, 92, 88};
        findSecondLargest(arr);
    }

}
