package com.ddlab.algol.completed;
//Done
public class RemoveDuplicatesFromSortedArray1 {

    public static void removeDuplicates(int[] a) {

        int j = 0 ;
        for (int i = 0; i < a.length; i++) {

            try {
                if( (a[i] ^ a[i+1]) == 0 ) {
                    //Duplicates
                }
                else {
                    j++;
                    a[j] = a[i+1];
                }
            }
            catch(IndexOutOfBoundsException ibe) {
                break;
            }
        }

        int newSize = (j+1);
        for (int i = 0; i < newSize; i++) {
            System.out.print(a[i]+"\t");
        }

    }

    public static void main(String[] args) {
//        int[] a = {6,7,8,9,9,10,11,11,11,12,13,13,14,14,14,14,15,15,17,19};
        int[] a = {-3,-2,-2,-2,0,0,1,1,2,3,4,5,5,5,6,6,6,6};
        removeDuplicates(a);
    }
}
