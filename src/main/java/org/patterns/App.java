package org.patterns;

import org.patterns.abstractFactory.AbstractFactoryClient;
import org.patterns.builder.BuilderClient;
import org.patterns.factory.FactoryClient;
import org.patterns.prototype.PrototypeClient;
import org.patterns.singleton.SingletonClient;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {

        // Singleton Pattern
        SingletonClient.execute();
        System.out.println();

        // Factory Design Pattern
        FactoryClient.execute();
        System.out.println();

        // Abstract Factory Design Pattern
        AbstractFactoryClient.execute();
        System.out.println();

        // Prototype Design Pattern
        PrototypeClient.execute();
        System.out.println();

        // Builder Design Pattern
        BuilderClient.execute();
        System.out.println();
    }
}
