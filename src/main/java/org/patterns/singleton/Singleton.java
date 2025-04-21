package org.patterns.singleton;

public class Singleton {
    // Instance
    private static Singleton singleton;
    private Singleton() {
        System.out.println("New instance is created.");
    }

    public static Singleton getInstance(){
        if(singleton ==null){
            singleton = new Singleton();
        }

        return singleton;
    }

//    If want to make it thread safe.
//    public static synchronized Singleton getInstance(){
//        if(singleton ==null){
//            singleton = new Singleton();
//        }
//
//        return singleton;
//    }

    public void execute(){
        System.out.println("Successfully executed.");
    }
}
