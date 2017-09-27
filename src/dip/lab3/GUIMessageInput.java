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
public class GUIMessageInput implements MessageInput {
    
    @Override
    public final String inputMessage() {
        String response =
           JOptionPane.showInputDialog(null, "Enter message here: ");
        return response;
    }
}
