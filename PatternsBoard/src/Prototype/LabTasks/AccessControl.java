/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.LabTasks;

/**
 *
 * @author Mukhtiar
 */
public class AccessControl implements Prototype{
	private final String controlLevel;
	private String access;
	public AccessControl(String controlLevel,String access){
		this.controlLevel = controlLevel;
		this.access = access;
	}
	private AccessControl (AccessControl accessControl){
		this.controlLevel = accessControl.getControlLevel();
		this.access = accessControl.getAccess();
	}
	public AccessControl clone(){
		return new AccessControl(this);
	}
	public String getControlLevel() {
		return controlLevel;
	}
	public String getAccess() {
		return access;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof AccessControl))
			return false;
		AccessControl obj2 = (AccessControl)obj;
		return ((obj2.getControlLevel().equals(controlLevel))&&(obj2.getAccess().equals(access)));
	}
	public void setAccess(String access) {
		this.access = access;
		
	}
}

