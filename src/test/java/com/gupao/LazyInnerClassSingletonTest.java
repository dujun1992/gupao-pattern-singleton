package com.gupao;

/**
 * Created by DJ on 2019年07月22日 14:16
 **/
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
