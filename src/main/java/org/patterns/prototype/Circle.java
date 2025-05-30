package org.patterns.prototype;

public class Circle implements Shape{

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a %s circle.%n", color);
    }
}
