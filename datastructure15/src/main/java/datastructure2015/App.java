package datastructure2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;


class Emp {

    private int sal = Integer.MAX_VALUE;//It can be MIN_VALUE
    private String name;

    public Emp( String name ) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (sal != emp.sal) return false;
        return !(name != null ? !name.equals(emp.name) : emp.name != null);

    }

    @Override
    public int hashCode() {
        int result = sal;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
public class App {

    //Used as Stack
    public static void useLinkedListAsStack() {

        LinkedList<String> ll = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            ll.push("T-" + i);
        }
        while (ll.size() != 0) {
            System.out.println("ll.pop();------>" + ll.pop());
        }
        System.out.println("ll.size()------>" + ll.size());
    }

    //As Queue
    public static void useLinkedListAsQueue() {

        LinkedList<String> ll = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            ll.offer("T-" + i);
        }
        while (ll.size() != 0) {
            System.out.println("ll.pop();------>" + ll.poll());
        }
        System.out.println("ll.size()------>" + ll.size());
    }

    public static void main(String[] args) {

        Emp emp = new Emp("a");
        System.out.print("Emp HashCode :::"+emp.hashCode());

    }


}
