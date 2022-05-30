/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Mukhtiar
 * Lab Tasks
 * 1. Add a code attribute to real image and set it via its constructor with default code value.
 *    Display the real image only if display code is matching to the real image code
 * 2. Add some additional details of file size while displaying the image in the Proxy
 * 3. Ask code in the display method to return fake on bad code or real image
 * 4. Find an example of using the Proxy pattern in your semester project, or any other example of your own
 */
public class ProxyImage implements Image{
	String fileName;
	Image service;
	

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}
	
	@Override
	public void display() {
		service = new RealImage(fileName);
		service.display();
                                
		
	}

}
