package com.ddlab.rnd.type2;

/**
 * Created by PIKU on 11/21/2015.
 */
public class Test1 {

    public static void main(String[] args) {
        Shape shape = new Shape();
        Surface surface = new Surface();
        Surface etchSurface = new EtchSurface();

        shape.draw(surface);
        shape.draw(etchSurface);
    }
}
