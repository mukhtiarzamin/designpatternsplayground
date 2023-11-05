/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.strategy.rg_payments.base;

/**
 *
 * @author Mukhtiar
 */
public class Item {
	private String name;
	private int price;
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
}
