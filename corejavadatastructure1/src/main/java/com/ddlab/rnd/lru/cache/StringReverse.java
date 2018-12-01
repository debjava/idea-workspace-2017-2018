package com.ddlab.rnd.lru.cache;

public class StringReverse {
    public static void main(String[] args) {
        String s = "abcd";
        //Reverse
        String reverse = "";
        for ( int i = s.length() - 1 ; i >= 0 ; i-- )
            reverse = reverse + s.charAt(i);
        System.out.println(reverse);

//            OR

        for (int i = 0; i < s.length()  ; i++)
            reverse = s.charAt(i)+reverse;

        System.out.println(reverse);
    }
}
