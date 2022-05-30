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
public class OffState implements State{

	@Override
	public void doAction() {
		System.out.println("TV is off");
		
	}

}
