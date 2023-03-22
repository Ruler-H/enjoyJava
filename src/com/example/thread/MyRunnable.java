package com.example.thread;

// 1. Runnable 인터페이스를 구현다.
public class MyRunnable implements Runnable {

    private String str;

    public MyRunnable(String str) {
        this.str = str;
    }

    // 2. run() 메소드를 오버라이딩 한다.
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
