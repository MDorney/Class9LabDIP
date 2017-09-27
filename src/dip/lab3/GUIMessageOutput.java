/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Doern
 */
public class GUIMessageOutput implements MessageOutput {
    
    @Override
    public final void outputMessage(String message) {
        JOptionPane.showMessageDialog(null,"The message that was sent was:" + message);
    }
    
}
