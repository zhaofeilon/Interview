package com.xuan.singleton;

public class SingleTon4 {
    private SingleTon4() {
    }

    private static class SingleTonInside {
        private static final SingleTon4 INSTANCE = new SingleTon4();
    }

    public static SingleTon4 getInstance() {
        return SingleTonInside.INSTANCE;
    }
}
