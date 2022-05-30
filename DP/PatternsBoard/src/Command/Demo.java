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
public class Demo {
    public static void main(String[] args) {
		FileSystemReciever reciever;
		String osName = System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		if(osName.contains("windows")){
			reciever = new WindowsFileSystemReciever();
		}
		else {
			reciever = new UnixFileSystemReciever();
		}
		Command cmd = new OpenFileCommand(reciever);
		FileInvoker invoker = new FileInvoker(cmd);
		invoker.execute();
                                
                                reciever.openFile();
		
		invoker.undo();
                                
		
		cmd = new CloseFileCommand(reciever);
		invoker = new FileInvoker(cmd);
		invoker.execute();
		
		invoker.undo();
	}
}
