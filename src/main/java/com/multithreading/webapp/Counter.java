package com.multithreading.webapp;


import java.math.BigInteger;

public class Counter {
    public BigInteger count = BigInteger.valueOf(0);
    public BigInteger sum = BigInteger.valueOf(0);

    public BigInteger getSum() {
        return count;
    }

    // Incrementing sum
    public synchronized BigInteger incr(BigInteger number) {
        count = count.add(number);
        return count;
    }

    // "end" calculation forgets all the numbers
    public BigInteger clear() {
        this.sum = count;
        count = BigInteger.valueOf(0);
        return count;
    }
}