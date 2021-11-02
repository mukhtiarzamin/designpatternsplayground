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
public class Demo {
    public static void main(String[] args) {
		GUIFactory factory; 
		Application app;		
		String osName = System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		if(osName.contains("mac")){
			factory = new MacFactory();
			app = new Application(factory);
		}
		else{
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		
		app.paint();

	}
}
