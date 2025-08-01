package com.genc.genc.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A implements B {
    public static void main(String[] args) {
        A a = new A();
        Arrays.stream(a.getClass().getMethods()).forEach(m -> System.out.println(m.getName()));
        String s = "abc";
        System.out.println(a.returnT(10));
        System.out.println(Math.cbrt(10.243));
    }

    public <T> T returnT(T t) {
        List<Integer[]> a = new ArrayList<>();
        return t;
    }
}
