package com.company.part1;


//There are two ways to create the Thread in java
//1. By extending the Thread class
//2. by immplemmenting the Runnable class and passing the  thread class into the thread constructor
class Test extends Runnable {
    @Override
    public void run() {
        for(int i = 0; i <10; i++){
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Threadpart1i {
    public static void main(String [] args){
        Thread t1 = new Thread(new Test());
        t1.start();
        Thread t2 = new Thread(new Test());
        t2.start();
    }
}
