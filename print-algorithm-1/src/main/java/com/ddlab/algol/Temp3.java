package com.ddlab.algol;

class A {

}

class B extends A {

}

class C extends B {

}

public class Temp3 {

    public static void main(String[] args) {
        A a1 = new A();

        B b1 = new B();

        C c1 = new C();

        System.out.println( a1.getClass() == b1.getClass() );
        System.out.println( c1.getClass() == b1.getClass());
    }
}
