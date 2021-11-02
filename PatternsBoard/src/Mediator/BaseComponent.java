/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediator;
public class BaseComponent {
    protected Mediator mediator;    
    public void setMediator(Mediator objMediator){
        this.mediator = objMediator;
    }
}
