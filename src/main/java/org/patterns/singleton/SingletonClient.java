package org.patterns.singleton;

public class SingletonClient {
    public static void execute(){
        // Singleton Design Pattern
        Singleton singleton = Singleton.getInstance();
        Singleton.getInstance().execute();
    }
}
