package com.homework1;

/**
 * Created by SV-PC on 19.07.2016.
 */
public class CastExample {
    public static void main(String[] args) {
        // Widening: byte - short - int - long - float - double
        byte bt = 120;
        short sh = bt;
        int nt = sh;
        long lg = nt;
        float fl = lg;
        double db = fl;
        System.out.println("Widening: byte - short - int - long - float - double: " );
        System.out.println("byte: "+ bt);
        System.out.println("short: "+ sh);
        System.out.println("int: "+ nt);
        System.out.println("long: "+ lg);
        System.out.println("float: "+ fl);
        System.out.println("double: "+ db);

        System.out.println();

        // Narrowing:    double - float - long - int - short - byte
        db = 21474836489.897654321;
        fl = (float) db;
        lg = (long) fl;
        nt = (int) lg;
        sh = (short) nt;
        bt = (byte) sh;
        System.out.println("Narrowing:    double - float - long - int - short - byte: ");

        System.out.println("double: "+ db);
        System.out.println("float: "+ fl);
        System.out.println("long: "+ lg);
        System.out.println("int: "+ nt);
        System.out.println("short: "+ sh);
        System.out.println("byte: "+ bt);


    }
}
