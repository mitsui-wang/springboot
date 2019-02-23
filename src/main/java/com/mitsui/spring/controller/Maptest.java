package com.mitsui.spring.controller;

import java.util.HashMap;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by mitsui on 2019/2/19.
 */
public class Maptest {
    public static void main(String[] args) throws Exception{

        TreeSet set = new TreeSet();
//        set.add(1);

        TreeMap s = new TreeMap();
        Stack stack;


//        HashSet t = new HashSet();
//        t.add(1);
//        t.add(3);
//        t.add(2);
//        System.out.println(t);

        HashMap t = new HashMap();
        t.put(1, 1);
        t.put(31, 1);
        t.put(2, 1);
        System.out.println(t.toString());
    }

    public static class App{
    }
}
