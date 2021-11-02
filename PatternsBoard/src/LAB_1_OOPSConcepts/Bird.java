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
class Bird extends Animal {
    public Bird()
    {
    ProtectedBy =  Hair_Feaather.getAnimalProtection(1);
    }

public void move() {
		 System.out.println("Moves by flying.");
     }
	public void eat() {
		 System.out.println("Eats birdfood.");
}	 

    public boolean isFaster(String fish) {
        
        switch(fish){
            case "Fish":
                return true;
        }
        return false;
    }
}
