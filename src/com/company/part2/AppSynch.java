package com.company.part2;

import java.util.Scanner;

//volatile is used to clsoe the thread and prevent it from cashing
class Processer extends Thread{
    private volatile boolean runnign = true;
    public void run(){
        while(runnign){
            System.out.println("Hello!!!");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void stoprunning(){
        runnign = false;
    }
}

public class AppSynch {
    public static void main(String[] args){
        Processer proc = new Processer();
        proc.start();


        System.out.println("Press Enter to stop processing......");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        proc.stoprunning();

    }
}
