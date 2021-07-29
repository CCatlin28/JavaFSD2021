package com.christycatlin.day3;

public class Demo15 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for(int i=0; i<10000;i++){
            stringBuffer.append("World");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + " ms");

        System.out.println("********************************");

        long startTime2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Hello");
        for(int i=0; i<10000;i++){
            stringBuilder.append("World");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime2) + " ms");

        System.out.println("********************************");

        long startTime3 = System.currentTimeMillis();
        String string = new String("Hello");
        for(int i=0; i<10000;i++){
            String sewString = string.concat("World");
        }
        System.out.println("Time taken by string.concat: " + (System.currentTimeMillis() - startTime2) + " ms");

    }
}
