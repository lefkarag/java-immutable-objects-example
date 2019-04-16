package com.javacodegeeks;

import java.util.Random;

public class ConcurrentExample {

    public static void main(String[] args) throws InterruptedException {
        Number number = new Number(1);

        for (int i = 0; i < 5; i++) {
            Thread t = new NumberChangerThread(number);
            t.start();
        }

        Thread.sleep(1000);
    }
}

class NumberChangerThread extends Thread {

    private Number number;

    public NumberChangerThread(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        int random = new Random().nextInt(100);
        System.out.println("changing id to " + random);
        number = new Number(random);
        System.out.println("id changed to " + number.getId());
    }
}

class Number {

    private final int id;

    public Number(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}