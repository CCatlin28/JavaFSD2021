package com.christycatlin.day5.practice;

class tryThread extends Thread {
    int [] a = {1,2,3,4,5};
    @Override
    public void run() {
        System.out.println("This is a test: "+Thread.currentThread().getName());
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]*10 + " This is thread "+Thread.currentThread().getName());
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

    }
}

public class T1 {
    public static void main(String[] args) {
        tryThread t1 = new tryThread();
        tryThread t2 = new tryThread();
        tryThread t3 = new tryThread();
       t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
//        t1.setPriority(5);
//        t2.setPriority(1);
//        t3.setPriority(10);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.start();
        t3.start();
    }
}
