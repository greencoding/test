package com.company.jvm.stack;

import com.company.jvm.stack.A;
import com.company.jvm.stack.B;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        A a = new A();
        B b = new B();

        new Thread(() -> {
            synchronized (a){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b){
                    System.out.println("我同时获得了a和b");
                }
            }
        }).start();
        Thread.sleep(1000);
        new Thread(() -> {
            synchronized (b){
                synchronized (a){
                    System.out.println("我同时获得了a和b");
                }
            }
        }).start();
    }
}
