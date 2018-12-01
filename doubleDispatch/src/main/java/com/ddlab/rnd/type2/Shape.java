package com.ddlab.rnd.type2;

/**
 * Created by PIKU on 11/21/2015.
 */
public class Shape {

    public void draw( Surface surface) {
        System.out.println("Surface ....");
        surface.show();
    }

    public void draw( EtchSurface surface) {
        System.out.println("EtchSurface ....");
        surface.show();
    }
}
