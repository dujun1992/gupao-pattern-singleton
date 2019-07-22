package com.gupao.lazy;

/**
 * Created by DJ on 2019年07月22日 13:48
 * 双重检查懒汉式，线程安全处理，指令重排序处理
 **/
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){}

    private volatile static LazyDoubleCheckSingleton lazy = null;

    public LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}
