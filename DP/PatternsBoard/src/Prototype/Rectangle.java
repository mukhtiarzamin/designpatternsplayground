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
public class Rectangle extends Shape{
	int width, height;

	public Rectangle(String color, int width, int height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Rectangle rectangle){
		super(rectangle);
		this.width = rectangle.width;
		this.height = rectangle.height;
	}

	@Override
	protected Shape clone() {
		return new Rectangle(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Rectangle)|| !super.equals(obj))
			return false;
		Rectangle rectangle2=(Rectangle)obj;
		return ((rectangle2.getWidth()==this.width)&&(rectangle2.getHeight()==this.height));

	}

	public int getWidth() {
		return this.width;
	}
	public int getHeight(){
		return this.height;
	}
}
