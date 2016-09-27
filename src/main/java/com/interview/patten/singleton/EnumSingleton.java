package com.interview.patten.singleton;

public enum EnumSingleton {

    INSTANCE {
        public void something() {
            System.out.println("here is enum singleton ");
        }
        // some method ...
    };

    public static EnumSingleton getInstance() {
        return EnumSingleton.INSTANCE;
    }
}
