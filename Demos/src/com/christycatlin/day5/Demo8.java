package com.christycatlin.day5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
    private String message;
    public WorkerThread(String msg){
        this.message = msg;
}
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " Start message -> "+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+ " End message -> "+message);

    }
    private void processMessage(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Demo8 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0; i<10; i++){
            Runnable worker = new WorkerThread(" "+i);
            executorService.execute(worker);
        }
    }
}
