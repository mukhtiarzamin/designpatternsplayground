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
public class TV {
	private State state;
	
	//Constructor
	public TV(State initialState) {
		this.state = initialState;
	}
	//delegate the work to the specific state
	public void doAction(){
		state.doAction();
	}
	public void changeState(State newState){
		this.state = newState;
	}
}
