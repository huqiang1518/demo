package com.huqiang.studydemo.demo;

import org.omg.CORBA.Current;

import java.util.*;

public class Demo04 {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        a.intValue();
        System.out.printf("a = %s, b = %s\n", a, b);
        swap(a,b);
        System.out.printf("a = %s, b = %s\n", a, b);

        List<String> arrayList = new ArrayList<>();
        arrayList.iterator();
        Arrays.sort(arrayList.toArray());

        Collections.sort(arrayList);

        Comparable<String> comparable = new Comparable<String >() {
            @Override
            public int compareTo(String o) {
                return 0;
            }
        };

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
    }

    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }


}
