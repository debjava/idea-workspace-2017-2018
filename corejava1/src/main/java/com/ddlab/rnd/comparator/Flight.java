package com.ddlab.rnd.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Flight implements Comparable<Flight> {

    private int distance;
    private int price;
    private boolean economy;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isEconomy() {
        return economy;
    }

    public void setEconomy(boolean economy) {
        this.economy = economy;
    }

    @Override
    public int compareTo(Flight o) {
        Flight flt = (Flight) o;
        if(this.distance < flt.distance && this.price < flt.price && this.economy == flt.economy )
            return 1;
        else
            return -1;

    }

    @Override
    public String toString() {
        return "Flight{" +
                "distance=" + distance +
                ", price=" + price +
                ", economy=" + economy +
                '}';
    }

    public static void main(String[] args) {
        List<Flight> fltList = new ArrayList<>();
        Flight fl1 = new Flight();
        fl1.setDistance(500);
        fl1.setEconomy(true);
        fl1.setPrice(1000);
        fltList.add(fl1);

        Flight fl2 = new Flight();
        fl2.setDistance(100);
        fl2.setEconomy(false);
        fl2.setPrice(2000);
        fltList.add(fl2);

        System.out.println(fltList);

        Collections.sort(fltList);
        System.out.println(fltList);
    }
}
