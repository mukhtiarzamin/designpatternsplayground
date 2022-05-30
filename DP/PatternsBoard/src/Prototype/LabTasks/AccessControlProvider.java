/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.LabTasks;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Mukhtiar
 */
public class AccessControlProvider {
	private static Map<String, AccessControl>map = new HashMap<String, AccessControl>();
	static{
		System.out.println("Fetching data from external resources and creating access control objects...");
				map.put("USER", new AccessControl("USER","DO_WORK"));
				map.put("ADMIN", new AccessControl("ADMIN","ADD/REMOVE USERS"));
				map.put("MANAGER", new AccessControl("MANAGER","GENERATE/READ REPORTS"));
				map.put("VP", new AccessControl("VP","MODIFY REPORTS"));
	}
	public static AccessControl getAccessControlObject(String controlLevel){
		AccessControl ac = null;
		ac = map.get(controlLevel);
		if(ac!=null){
			return ac.clone();
		}
		return null;
	}
}