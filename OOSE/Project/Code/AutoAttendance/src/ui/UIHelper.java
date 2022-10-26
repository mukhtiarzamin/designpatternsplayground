/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import javax.swing.JFrame;

/**
 *
 * @author Mukhtiar-HPC
 */
public class UIHelper {

    static void backToDashboard(Dashboard objDashboard, JFrame currentForm) {
        objDashboard.setVisible(true);
        currentForm.dispose();
    }
    
}
