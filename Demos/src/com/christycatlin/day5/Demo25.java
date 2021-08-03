package com.christycatlin.day5;

public class Demo25 {
    public static void main(String[] args) {
        // try to convert all primitive type into its wrapper class
        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 12.3f;
        double f = 12.24;
        char g = 'a';
        boolean h = true;

        // autoboxing: converting primitives into object
        Byte byteObj = a;
        Short shorObj = b;
        Integer intObj = 30;
        // unboxing convert object into primitive
        byte byteValue = byteObj;
        short shortValue = shorObj;
        int intValue = intObj;
    }
}
