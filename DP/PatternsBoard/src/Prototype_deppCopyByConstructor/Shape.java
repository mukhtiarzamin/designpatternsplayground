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
public abstract class Shape {
    
    protected int x;
    protected int y;
    protected ShapeStyle shapeStyle;
    
    public Shape() {
        super();
    }

    // prototype or deep copy constructor
    public Shape(Shape shape) {
        this();
        System.out.println("Deep Copying Shape...");
        this.x = shape.x;
        this.y = shape.y;
        this.shapeStyle = new ShapeStyle(shape.shapeStyle);
    }
    
    abstract void draw();
    abstract String type();
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public ShapeStyle getStyle() {
        return shapeStyle;
    }
    public void setStyle(ShapeStyle shapeStyle) {
        this.shapeStyle = shapeStyle;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("x=").append(x).append(", y=").append(y).append(", ").append(shapeStyle);
        return builder.toString();
    }
}
