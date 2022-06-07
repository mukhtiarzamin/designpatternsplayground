/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Mukhtiar
 */
public class Application {
    private Button button;
	private Checkbox checkbox;
	
	public Application(GUIFactory factory){
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}
	
	public void paint(){
		button.paint();
		checkbox.paint();
	}
}
