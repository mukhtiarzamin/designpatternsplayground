/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.DALManager;
import dal.RecordsMapper;

/**
 *
 * @author Mukhtiar
 */
public class SMSFactory {

    static DALManager getInstanceOfDALManager() {
        return new DALManager(new RecordsMapper());
    }

    public static SMSController getInstanceOfSMSController() {
        return new SMSController();
    }
    
}
