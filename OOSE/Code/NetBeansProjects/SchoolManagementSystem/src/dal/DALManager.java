/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.dto.EmployeeDTO;

/**
 *
 * @author Mukhtiar
 */
public class DALManager {
    IConnection objConnection;
    DBReader objReader;
    RecordsMapper objMapper;

    public DALManager(RecordsMapper mapper){
    objConnection = new SQLConnection("MUKHTIAR-PC","northwindd", "sa","7intin");
    objReader = new DBReader();
    this.objMapper=mapper;
    }
    public ArrayList<EmployeeDTO> getEmployeesList() {
                
        Connection  dbConnection = objConnection.getConnection();
        ResultSet rs = objReader.getRecords("Select * from Employees", dbConnection);
        return objMapper.getEmployees(rs);
        
    }  
    
}
