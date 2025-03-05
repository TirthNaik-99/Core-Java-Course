package org.example;

class Hi extends Thread {
    public void run(){
        for(int i=0; i<=5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

class Hellos extends Thread{
    public void run(){
        for(int i=0; i<=5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        Hi h = new Hi();
        Hellos h1 = new Hellos();
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();
        h.start();
    }
}
