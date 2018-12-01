package com.ddlab.rnd.cb;

/**
 * Created by PIKU on 8/3/2017.
 */
public class MyTask implements Runnable {

    private MyBean bean;

    public MyTask(MyBean bean) {
        this.bean = bean;
    }

    @Override
    public void run() {

        System.out.println("MyBean--->"+bean);


    }
}
