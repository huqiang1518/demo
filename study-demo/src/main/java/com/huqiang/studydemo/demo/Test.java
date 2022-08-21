package com.huqiang.studydemo.demo;

public interface Test {
    default void test(){
        System.out.println("dssdddsffdsf");
    }

    static void test1(){
        System.out.println("wdsfdsfdsf");
    }
}
