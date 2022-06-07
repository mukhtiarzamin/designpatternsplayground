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
public class CloseFileCommand implements Command{
	FileSystemReciever reciever;
	

	public CloseFileCommand(FileSystemReciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public void execute() {
		reciever.closeFile();
		
	}

	@Override
	public void undo() {
		reciever.openFile();
		
	}
	

}
