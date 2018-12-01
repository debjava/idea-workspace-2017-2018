package com.ddlab.rnd.cb;

/**
 * Created by PIKU on 8/3/2017.
 */
public class MyBean {
    private String fl1;
    private String fl2;
    private String fl3;

    public String getFl1() {
        return fl1;
    }

    public void setFl1(String fl1) {
        this.fl1 = fl1;
    }

    public String getFl2() {
        return fl2;
    }

    public void setFl2(String fl2) {
        this.fl2 = fl2;
    }

    public String getFl3() {
        return fl3;
    }

    public void setFl3(String fl3) {
        this.fl3 = fl3;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "fl1='" + fl1 + '\'' +
                ", fl2='" + fl2 + '\'' +
                ", fl3='" + fl3 + '\'' +
                '}';
    }
}
