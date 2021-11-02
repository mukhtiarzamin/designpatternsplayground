/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Mukhtiar
 */
public class Demo {

	public static void main(String[] args) {
		//use real service directly
		Image image = new RealImage("test_10mb.jpg");
		System.out.println(image.getFileName());
		image.display();
		
		
		//use proxy
		Image proxyImage = new ProxyImage("test_10mb.jpg");
		System.out.println(proxyImage.getFileName());
		proxyImage.display();
		

	}

}
