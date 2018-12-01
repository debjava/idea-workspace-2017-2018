package com.ddlab.rnd.type4;

import java.util.ArrayList;
import java.util.List;

class Rectangle {

    public void draw(Shape shape) {
        shape.draw(this);
    }
}

class SmallRectangle extends Rectangle {

    public void draw(Shape shape) {
        shape.draw(this);
    }
}

class BigRectangle extends Rectangle {

    public void draw(Shape shape) {
        shape.draw(this);
    }
}

class Shape {

    public void draw(Rectangle rectangle) {
        System.out.println("... Rectangle ...");
    }

    public void draw(SmallRectangle rectangle) {
        System.out.println("... Small Rectangle ...");
    }

    public void draw(BigRectangle rectangle) {
        System.out.println("... Big Rectangle ...");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        List<Rectangle> list = new ArrayList<Rectangle>();
        list.add(new Rectangle());
        list.add(new SmallRectangle());
        list.add(new BigRectangle());

        for (Rectangle rect : list) {
//            shape.draw(rect);

            rect.draw(shape);
        }

    }
}
