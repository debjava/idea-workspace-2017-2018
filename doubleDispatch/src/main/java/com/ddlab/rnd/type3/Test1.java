package com.ddlab.rnd.type3;

import java.util.ArrayList;
import java.util.List;

class Circle {
    public void show() {
        System.out.println(" I am the circle");
    }
}

class SmallCircle extends Circle {
    public void show() {
        System.out.println(" I am the small circle");
    }
}

class BigCircle extends Circle {
    public void show() {
        System.out.println(" I am the big circle");
    }
}

class Shape {

    public void draw(Circle circle) {
        System.out.println("... Circle ...");
        circle.show();
    }

    public void draw(BigCircle circle) {
        System.out.println("... Big Circle ...");
        circle.show();
    }

    public void draw(SmallCircle circle) {
        System.out.println("... Small Circle ...");
        circle.show();
    }
}

public class Test1 {

    public static void main(String[] args) {

        Shape shape = new Shape();
        List<Circle> circles = new ArrayList<Circle>();

        circles.add(new Circle());
        circles.add(new BigCircle());
        circles.add(new SmallCircle());

        for (Circle circle : circles) {
            shape.draw(circle); //Do not call like this
        }

    }
}
