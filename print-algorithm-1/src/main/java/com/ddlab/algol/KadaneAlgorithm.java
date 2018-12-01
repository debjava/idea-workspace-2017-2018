package com.ddlab.algol;

/**
 * Created by PIKU on 9/18/2015.
 */
public class KadaneAlgorithm {

    public static int maxSubArraySum(int a[])
    {
        int max_so_far = 0, max_ending_here = 0;
        int i;
        for(i = 0; i < a.length; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if(max_ending_here < 0) {
                max_ending_here = 0;

            }

     /* Do not compare for all elements. Compare only
        when  max_ending_here > 0 */
            else if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;

            }
//            else {
//                System.out.println(a[i]);
//            }

        }
        return max_so_far;
    }

    public static void main(String[] args) {

        int a[] =  {-2,1, -3, 4, -1, 2, 1, -5, 4};
        int max_sum = maxSubArraySum(a);
        System.out.println("Maximum contiguous sum is :::\n"+ max_sum);
    }
}
