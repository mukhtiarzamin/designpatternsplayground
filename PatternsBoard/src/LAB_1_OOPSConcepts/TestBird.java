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
public class TestBird {
                public static void main(){
                Animal myBird = new Bird();
System.out.print("Main without Params");
		myBird.label();
		myBird.move();
		myBird.eat();
                }
	public static void main(String[] args) {
                    main();
		Animal myBird = new Bird();
System.out.print("Main with Params");
		myBird.label();
		myBird.move();
		myBird.eat();
	}
}
