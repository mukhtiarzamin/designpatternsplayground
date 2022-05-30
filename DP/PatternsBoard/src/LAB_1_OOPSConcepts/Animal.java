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
abstract class Animal implements IAnimal {
	
                protected String ProtectedBy;
	// concrete method
	void label() {
		System.out.println("Animal's data:");
	}
}