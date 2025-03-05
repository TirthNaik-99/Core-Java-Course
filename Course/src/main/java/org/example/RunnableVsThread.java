package org.example;

//class I implements Runnable {
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("I show");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//}
//class J implements Runnable {
//
//        @Override
//        public void run() {
//            for(int i=0;i<10;i++) {
//                System.out.println("J show");
//                try{Thread.sleep(10); }catch(InterruptedException e){
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//    }

public class RunnableVsThread {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("I show");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("J show");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
