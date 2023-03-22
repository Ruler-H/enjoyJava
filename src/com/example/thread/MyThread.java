package com.example.thread;

// 1. Thread 클래스를 상속받는다.
public class MyThread extends Thread{
    private String str;

    public MyThread(String str) {
        this.str = str;
    }

    // 2. run() 메소드를 오버라이딩 한다.
    //    동시에 실행시키고 싶은 코드를 작동시킨다.
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
