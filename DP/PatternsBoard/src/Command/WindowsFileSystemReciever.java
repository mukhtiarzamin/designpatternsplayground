/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author Mukhtiar
 */
public class WindowsFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("File is opened by Windows OS");
		
	}

	@Override
	public void closeFile() {
		System.out.println("File is closed by Windows OS");
		
	}

	@Override
	public void writeFile() {
		System.out.println("File is written by Windows OS");
		
	}

}
