/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Doern
 */
public class Driver {
    
    public static void main(String[] args) {
        
        MessageInput guiInput = new GUIMessageInput();
        MessageInput keyboardInput = new KeyboardMessageInput();
        MessageOutput guiOutput = new GUIMessageOutput();
        MessageOutput consoleOutput = new ConsoleMessageOutput();

        MessagingService messageService = new MessagingService(guiInput, guiOutput);

        messageService.sendMessage();
        
        messageService.setOutput(consoleOutput);
        messageService.setInput(keyboardInput);
        
        messageService.sendMessage();
    }
    
}
