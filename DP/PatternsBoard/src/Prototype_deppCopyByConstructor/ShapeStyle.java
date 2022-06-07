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
public class ShapeStyle {
    protected Color lineColor;
    protected LinePattern linePattern;
    protected double lineThickness;

    public ShapeStyle() {
        super();
    }
    
    // prototype or deep copy constructor
    public ShapeStyle(ShapeStyle shapeStyle) {
        this();
        System.out.println("Deep Copying ShapeStyle...");
        this.lineColor = shapeStyle.lineColor;
        this.linePattern = shapeStyle.linePattern;
        this.lineThickness = shapeStyle.lineThickness;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {

        this.lineColor = lineColor;
    }

    public LinePattern getLinePattern() {
        return linePattern;
    }

    public void setLinePattern(LinePattern linePattern) {

        this.linePattern = linePattern;
    }
    public double getLineThickness() {
        return lineThickness;
    }

    public void setLineThickness(double lineThickness) {

        this.lineThickness = lineThickness;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("lineColor=").append(lineColor).append(", linePattern=").append(linePattern)
                .append(", lineThickness=").append(lineThickness);
        return builder.toString();
    }
}
