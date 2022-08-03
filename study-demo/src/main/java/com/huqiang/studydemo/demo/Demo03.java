package com.huqiang.studydemo.demo;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo03 {
    public static void main(String[] args) throws InterruptedException {
//        new ThreadPoolExecutor();
//        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//        cachedThreadPool.execute(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//        Thread.sleep(1000);

//        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
//        for (int i=0;i<10;i++){
//            final int index=i;
//            newFixedThreadPool.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        System.out.println(index);
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            });
//        }

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println("delay 3 seconds");
                }
            },3, TimeUnit.SECONDS);

        Lock reentrantLock = new ReentrantLock();

        Thread thread = new Thread();
        thread.getName();

        Thread currentThread = Thread.currentThread();
        currentThread.getName();

        Lock lock = new Lock() {
            @Override
            public void lock() {

            }

            @Override
            public void lockInterruptibly() throws InterruptedException {

            }

            @Override
            public boolean tryLock() {
                return false;
            }

            @Override
            public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
                return false;
            }

            @Override
            public void unlock() {

            }

            @Override
            public Condition newCondition() {
                return null;
            }
        };

    }
}
