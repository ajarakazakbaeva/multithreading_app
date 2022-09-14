package com.multithreading.webapp.controller;

import com.multithreading.webapp.Counter;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;



@RestController
@RequestMapping("/sum")
public class ResultController {
    private volatile boolean done;
    private BigInteger sum;

    private BigInteger number;
    Counter c = new Counter();

    @PostMapping(value = "/result")
    public String postBody(@RequestBody String argument) throws InterruptedException {
        // If a request with the keyword "end" arrives
        if (argument.equals("end")) {
            sum = c.getSum();
            c.clear();
            return String.valueOf(sum);
        }
        // If a request with the keyword "end" arrives
        else {
            Thread t = new Thread(new Runnable(){
                public void run(){
                    try {
                        number = new BigInteger(argument);
                    } catch (NumberFormatException nfe) {
                        System.out.println("NumberFormat Exception: invalid input string"); // Handling NumberFormatException: ignoring string and not incrementing total sum
                        number = BigInteger.valueOf(0);
                    }
                    c.incr(number);
                }
            });

            t.start(); // Starting parallel thread
            try {
                do {
                    t.join();
                } while (!c.count.equals(BigInteger.valueOf(0))); // Waiting until "end" calculation forgets all the numbers
            } catch (InterruptedException e) {}
            return String.valueOf(sum);
        }
    }
}
