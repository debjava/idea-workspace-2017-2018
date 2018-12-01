package com.ddlab.rnd.cb;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CyclicBarrierExample {

    //Runnable task for each thread
    private static class Task implements Runnable {

        private CyclicBarrier barrier;
        private MyBean bean;

        public Task(CyclicBarrier barrier, MyBean bean) {
            this.barrier = barrier;
            this.bean = bean;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
                if( Thread.currentThread().getName().equals("Thread 1"))
                    bean.setFl1(Thread.currentThread().getName());
                else if(Thread.currentThread().getName().equals("Thread 2"))
                    bean.setFl2(Thread.currentThread().getName());
                else
                    bean.setFl3(Thread.currentThread().getName());
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
            } catch (InterruptedException ex) {
                Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BrokenBarrierException ex) {
                Logger.getLogger(CyclicBarrierExample.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String args[]) {

        MyBean bean = new MyBean();
        //creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()

        CyclicBarrier cb = new CyclicBarrier(3, new MyTask(bean));
//        final CyclicBarrier cb = new CyclicBarrier(3, new Runnable(){
//            @Override
//            public void run(){
//                //This task will be executed once all thread reaches barrier
//                System.out.println("All parties are arrived at barrier, lets play");
//            }
//        });

        //starting each of thread
        Thread t1 = new Thread(new Task(cb,bean), "Thread 1" );
        Thread t2 = new Thread(new Task(cb, bean), "Thread 2");
        Thread t3 = new Thread(new Task(cb, bean), "Thread 3" );

        t1.start();
        t2.start();
        t3.start();
      
    }
}
