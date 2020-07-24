package com.company.part1;

class Runnable extends  Thread{
    public void run() {
        for(int i =0 ; i<10; i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPart1 {
    public static void main(String[] args){
        Runnable runnable = new Runnable();
        runnable.start();
        Runnable runnable1 = new Runnable();
        runnable1.start();

    }
}
