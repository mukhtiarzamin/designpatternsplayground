/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype_deppCopyByConstructor;

/**
 *
 * @author Mukhtiar
 */
public class Circle extends Shape {
    protected int radius;
    protected FillStyle fillStyle;

    public Circle() {
        super();
    }

    // prototype or deep copy constructor
    public Circle(Circle circle) {
        super(circle);
        System.out.println("Deep Copying Circle...");
        this.radius = circle.radius;
        this.fillStyle = new FillStyle(circle.fillStyle);
    }
    
    @Override
    public void draw() {
        System.out.printf("Drawing Circle (%s, %s).\n", super.toString(), this.toString());
    }
    
    @Override
    String type() {
        return "Circle";
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public FillStyle getFillStyle() {
        return fillStyle;        
    }
    
    public void setFillStyle(FillStyle fillStyle) {
        this.fillStyle = fillStyle;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("radius=").append(radius).append(", ").append(fillStyle);
        return builder.toString();
    }
}
