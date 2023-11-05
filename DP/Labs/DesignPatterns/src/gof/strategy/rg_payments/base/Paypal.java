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
public class Paypal implements PaymentStrategy{
	private String emailAddress;
	private String pwd;
	public Paypal(String emailAddress, String pwd) {
		this.emailAddress = emailAddress;
		this.pwd = pwd;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount+ "PKR has been successfully payed from your Paypal account "+emailAddress);
		
	}

}
