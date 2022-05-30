/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_1_OOPSConcepts;

/**
 *
 * @author Mukhtiar
 */
public class TestFish {
	public static void main(String[] args) {
                                Bird objBird = new Bird();
		Animal myFish = new Fish(objBird);

		myFish.label();
		myFish.move();
		myFish.eat();
	}
}
