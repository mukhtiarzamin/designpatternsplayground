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
public class FillStyle {

    protected Color fillColor;
    protected FillPattern fillPattern;

    public FillStyle() {
        super();
    }


    // prototype or deep copy constructor
    public FillStyle(FillStyle fillStyle) {
        super();
        System.out.println("Deep Copying FillStyle...");
        this.fillColor = fillStyle.fillColor;
        this.fillPattern = fillStyle.fillPattern;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public FillPattern getFillPattern() {
        return fillPattern;
    }

    public void setFillPattern(FillPattern fillPattern) {
        this.fillPattern = fillPattern;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("fillColor=").append(fillColor).append(", fillPattern=").append(fillPattern);
        return builder.toString();
    }
}
