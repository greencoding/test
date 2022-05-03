package com.company.jvm.heap;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1...");
        Thread.sleep(20000L);
        byte[] bytes = new byte[1024 * 1024 * 10];
        System.out.println("2...");
        Thread.sleep(20000L);
        bytes = null;
        System.gc();
        System.out.println("3...");
        Thread.sleep(10000000L);
    }
}
