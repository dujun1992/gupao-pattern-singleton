package com.gupao.lazy;

/**
 * Created by DJ on 2019年07月22日 13:48
 * 简单懒汉式,线程安全处理
 **/
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazy = null;

    public synchronized LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
