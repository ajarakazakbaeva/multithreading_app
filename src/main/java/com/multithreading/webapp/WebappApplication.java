package com.multithreading.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import java.util.logging.Logger;

import static org.testng.AssertJUnit.assertFalse;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class);
//		Counter c = new Counter();



	}

}

//	public static void main(String[] args)throws InterruptedException {
//
//		Counter c = new Counter();
//		Thread t1 = new Thread(new Runnable(){
//			public void run(){
//				int number = 5;
//				c.incr(number);
//			}
//		});
//
//		Thread t2 = new Thread(new Runnable(){
//			public void run(){
//				int number = 5;
//				c.incr(number);
//			}
//		});
//
//		t1.start();
//		t2.start();
//
//		t1.join();
//		t2.join();
//
//		System.out.println("Count = " + c.count);
//	}
//}
//
//
//
