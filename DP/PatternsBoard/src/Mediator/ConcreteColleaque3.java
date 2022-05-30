/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;
public class ConcreteColleaque3 extends BaseComponent {
    public ConcreteColleaque3(Mediator objMediator){
        this.mediator = objMediator;
    }    
    public void doOperationAll(){
        System.out.println("Colleaque 3 asking mediator to perform operationA and operationD.");
        mediator.operationA();
        mediator.operationD();
        System.out.println("Colleaque 3 performed all operations.");
    }
}
