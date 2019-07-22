package com.gupao;

import com.gupao.threadlocal.ThreadLocalSingleton;

/**
 * Created by DJ on 2019年07月22日 14:16
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
//        LazyInnelClassSingleton singleton = LazyInnelClassSingleton.getInstance();
        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
