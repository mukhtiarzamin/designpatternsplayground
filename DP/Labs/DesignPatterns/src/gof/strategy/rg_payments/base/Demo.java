/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.strategy.rg_payments.base;
public class Demo {	
    public static void main(String[] args) {		
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Code complete",120);
        Item item2 = new Item("Design patterns in java: a practical tutorial",100);
        
        cart.addItem(item1);
        cart.addItem(item2);
        
        cart.setPaymentStrategy(new Paypal("myemail@example.com", "mypwd"));
        //pay by paypal
        cart.checkOut();
        //pay by credit card
        cart.setPaymentStrategy(new CreditCard("Syed Sajid Hussain", "1234567890123456", "1234", "12/20"));
		cart.checkOut();


	}

}
