package com.huqiang.studydemo.demo;

import org.springframework.stereotype.Controller;
import sun.nio.ch.ThreadPool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Controller
public class Demo01 {

    static int i = 1;

    public static void main(String[] args) throws InterruptedException {

        String str = "sdlkfsdklfjkl";



        HashMap<Object, Object> map = new HashMap<>();
        Hashtable<Object, Object> hashtable = new Hashtable<>();
        ArrayList<Object> arrayList = new ArrayList<>();
        Vector<Object> vector = new Vector<>();
        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();

        System.out.println(isAdd(6));

        Thread.sleep(1000);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("sdjflksdjfklds");
            }
        }).start();

        new Thread(() -> System.out.println("kdsjldskldsk")).start();

        System.out.println(Thread.currentThread().getName());

        ArrayList<String> strings = new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();

        Thread.sleep(1000);

        Thread thread = new Thread();
        thread.wait(1000);

        Executors.newFixedThreadPool(3);

        System.gc();


    }



    public void test() {
    }

    static Boolean isAdd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
