/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Mukhtiar
 */
public abstract class Shape {
	String color;

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public Shape(Shape shape){
		this.color = shape.color;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Shape))
			return false;
		Shape shape2=(Shape)obj;
		String color2=shape2.getColor();
		if(color2.equals(this.color))
			return true;
		else
			return false;
	}
	
	protected abstract Shape clone(); 
		
	
}
