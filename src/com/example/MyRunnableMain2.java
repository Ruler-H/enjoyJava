package com.example;

public class MyRunnableMain2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello!!!");

            }
        };

        RunnableExcute runnableExcute = new RunnableExcute();
        System.out.println("---------------");
        runnableExcute.excute(myRunnable);
        System.out.println("---------------");
    }
}
