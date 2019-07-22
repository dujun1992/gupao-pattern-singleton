package com.gupao.register;

/**
 * Created by DJ on 2019年07月22日 15:07
 **/
public enum EnumSingleton {
    INSTANCE;
    private Object data; //存储对象
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
