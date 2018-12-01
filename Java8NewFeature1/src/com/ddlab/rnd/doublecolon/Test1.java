package com.ddlab.rnd.doublecolon;

public class Test1 {

    public static int getMinVal(int x, int y, MinMaxInterface min) {

        return min.getMinimum(x,y);
    }
  public static void main(String[] args) {

        int val = getMinVal(10, 20, new MinMaxInterface() {
            @Override
            public int getMinimum(int a, int b) {
                return Math.min(a,b);
            }
        });


    System.out.println(val);
  }
}
