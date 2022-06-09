/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.DALManager;
import java.util.ArrayList;
import model.dto.EmployeeDTO;

/**
 *
 * @author Mukhtiar
 */
public class SMSController {
    DALManager objDAL;
    public SMSController(){
    objDAL = SMSFactory.getInstanceOfDALManager();
    }

    public ArrayList<EmployeeDTO> viewEmployees() {
        return objDAL.getEmployeesList();
    }
}
