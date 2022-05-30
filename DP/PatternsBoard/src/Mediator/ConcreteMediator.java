/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;
public class ConcreteMediator  implements Mediator{
    private ConcreteColleaque1 objColleaque1;
    private ConcreteColleaque2 objColleaque2;
               
    // Mediator aggregates its concrete colleaques
    public ConcreteMediator(ConcreteColleaque1 component1, ConcreteColleaque2 component2) {
        this.objColleaque1 = component1;
        component1.setMediator(this);
        this.objColleaque2 = component2;
        component2.setMediator(this);
    }		
	
    @Override
    public void operationA() {
        System.out.println("Mediator knows that operationA can be done by Colleaque1.");        
        objColleaque1.doOperationA();
    }
    @Override
    public void operationD() {
        System.out.println("Mediator knows operationD can be done by Colleaque2.");        
        objColleaque2.doOperationD();
    }
}