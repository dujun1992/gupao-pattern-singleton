package com.gupao.hungry;

/**
 * Created by DJ on 2019年07月22日 13:37
 * 饿汉式单例
 **/
public class HungrySingleton {

    private  static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
