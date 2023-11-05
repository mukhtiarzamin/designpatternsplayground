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
public class CreditCard implements PaymentStrategy{
	String name;
	String cardNr;
	String pin;
	String dateOfExpiry;
	
	public CreditCard(String name, String cardNr, String pin, String dateOfExpiry) {
		this.name = name;
		this.cardNr = cardNr;
		this.pin = pin;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+ "PKR has been paid from your credit card "+cardNr);
		
	}

}
