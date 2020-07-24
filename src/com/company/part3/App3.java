package com.company.part3;

public class App3 {
    private  int count = 0;
    public synchronized void increasement(){
        count++;
    }
    public static void main(String [] args) throws InterruptedException {
        App3 app = new App3();
        app.dowork();

    }
    public void dowork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0 ;i <15000;i++){
                    increasement();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0 ;i <15000;i++){
                    increasement();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("total count is " + count);

    }
}
