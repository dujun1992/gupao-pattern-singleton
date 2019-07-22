package com.gupao.hungry;

/**
 * Created by DJ on 2019年07月22日 13:37
 * 饿汉式单例,静态块
 **/
public class HungryStaticSingleton {

    private  static final HungryStaticSingleton hungrySingleton ;

    static{
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }

}
