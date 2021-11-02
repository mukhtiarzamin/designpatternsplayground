/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author Mukhtiar
 */
public class Demo {

	public static void main(String[] args) {
		TV tv = (TV) new ConcreteTV();
		
		Iterator it = tv.getIterator();
		
		while(it.hasMore()){
			System.out.println("My TV is playing "+it.getNext()+" now");
		}

	}

}
