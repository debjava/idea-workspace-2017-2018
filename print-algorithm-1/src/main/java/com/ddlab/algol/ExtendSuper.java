package com.ddlab.algol;


import java.util.ArrayList;
import java.util.List;

class Fruit {

}

class Apple extends Fruit {

}

class AsianApple extends Apple {

}

class AfricanApple extends Apple {

}

class Orange extends Fruit {

}
public class ExtendSuper {

    public static void main(String[] args) {

        List<Fruit> list = new ArrayList<>();
        list.add( new Fruit());
        list.add( new Apple());
        list.add(new Orange());
        list.add(new AsianApple());
        list.add(new AfricanApple());

//        List< ? extends Fruit > fruitList = new ArrayList<Fruit>();

        List< ? super Fruit > fruitList = list;

//        for( int i = 0 ; i < list.size() ; i++ ) {
//
//            System.out.println(list.get(i));
//        }





    }
}
