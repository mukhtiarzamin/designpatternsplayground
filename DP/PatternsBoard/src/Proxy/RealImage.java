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
public class RealImage implements Image{
	String fileName;
	public RealImage(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	@Override
	public void display() {
		loadFromDisk();
		System.out.println("Displaying "+fileName);
		
	}
	public void loadFromDisk(){
		System.out.println("loading "+fileName);
	}

}
