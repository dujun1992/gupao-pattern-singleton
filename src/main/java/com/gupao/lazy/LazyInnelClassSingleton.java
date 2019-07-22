package com.gupao.lazy;

/**
 * Created by DJ on 2019年07月22日 13:48
 * 懒汉式,静态内部类式
 **/
public class LazyInnelClassSingleton {

    private LazyInnelClassSingleton(){
        //避免反射
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }


    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public static  final LazyInnelClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    //内部类
    private static class LazyHolder{
        private static final LazyInnelClassSingleton LAZY = new LazyInnelClassSingleton();
    }


}
