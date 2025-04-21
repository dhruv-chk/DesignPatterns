package org.patterns.prototype;

import org.patterns.singleton.Singleton;

public class PrototypeClient {

    public static void execute(){
        // Prototype Design Pattern
        // Create a concrete prototype (a red circle).
        Shape circlePrototype = new Circle("red");

        // Create a client and give it the prototype.
        ShapeClient client = new ShapeClient(circlePrototype);

        // Use the prototype to create a new shape (a red circle).
        Shape redCircle = client.createShape();

        // Draw the newly created red circle.
        redCircle.draw();
    }
}
