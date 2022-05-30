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
class Fish extends Animal {
    Bird objBird;
    public Fish(Bird obj){
    objBird = obj;
    }
    
    public Fish(){
    objBird = new Bird();
    }
    
    
		 public void move() {
                                    // Bird objBird = new Bird();
                                     objBird.isFaster("Fish");
			 System.out.println("Moves by swimming.");
	     }
		public void eat() {
			 System.out.println("Eats seafood.");
		 }
}
