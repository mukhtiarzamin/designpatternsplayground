/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Mukhtiar
 */
public class Demo {

	public static void main(String[] args) {
		State off = new OffState();
		TV tv = new TV(off);
		tv.doAction();
		
		State on = new OnState();
		tv.changeState(on);
		tv.doAction();

	}

}
