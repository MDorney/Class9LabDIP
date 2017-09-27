/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Doern
 */
public class KeyboardMessageInput  implements MessageInput {
    
    @Override
    public final String inputMessage() {
        System.out.println("Please enter your message, then press return:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
    }
    
}
