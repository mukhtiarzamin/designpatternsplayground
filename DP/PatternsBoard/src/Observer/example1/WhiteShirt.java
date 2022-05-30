/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.example1;

import java.util.ArrayList;

/**
 *
 * @author Mukhtiar
 */
public class WhiteShirt implements Publisher{
	private ArrayList<Subscriber> subscribers;
	boolean inStock = false;

	public WhiteShirt() {
		subscribers = new ArrayList<Subscriber>();
	}
	
	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
		if(inStock){
			notifySubscribers();
		}
	}

	@Override
	public void subscribe(Subscriber s) {
		if(!subscribers.contains(s)){
			subscribers.add(s);
		}	
	}

	@Override
	public void unscubscribe(Subscriber s) {
		if(subscribers.contains(s)){
			subscribers.remove(s);
		}
	}
	
	public void notifySubscribers(){
		for(Subscriber s: subscribers){
			s.update();
		}
	}

}
