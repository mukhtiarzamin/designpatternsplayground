/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.example1;

/**
 *
 * @author Mukhtiar
 */
public class Demo {
    public static void main(String[] args) {
		WhiteShirt shirt = new WhiteShirt();
		
		Person shouzeb = new Person("Shouzeb");
		Person khurram = new Person ("Khurram");
		Person waleed = new Person ("Waleed");
		
		shirt.subscribe(shouzeb);
		shirt.subscribe(waleed);
		
		shirt.setInStock(true);
		shirt.setInStock(false);
		
		shirt.unscubscribe(shouzeb);
		shirt.setInStock(true);
		

	}
}
