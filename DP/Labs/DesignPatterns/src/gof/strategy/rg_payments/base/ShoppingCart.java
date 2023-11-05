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
import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
	private ArrayList<Item> items = new ArrayList<Item>();
	private PaymentStrategy strategy;
	
	public void addItem(Item item){
		this.items.add(item);
	}
	public int calculateTotalAmount(){
		Iterator<Item> iterator = items.iterator();
		int total = 0;
		while(iterator.hasNext()){
			total+=iterator.next().getPrice();
		}
		return total;
		
	}
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void checkOut(){
		int total = calculateTotalAmount();
		strategy.pay(total);
	}
	
}
