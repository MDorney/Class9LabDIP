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
public class MessagingService {
    private MessageOutput output;
    private MessageInput input;
    
    public MessagingService(MessageInput input, MessageOutput output) {
        this.setOutput(output);
        this.setInput(input);
    }
    
    public final void sendMessage() {
        output.outputMessage(input.inputMessage());
    }

    public final MessageOutput getOutput() {
        return output;
    }

    public final void setOutput(MessageOutput output) {
        if (output == null) {
            throw new IllegalArgumentException("Their must be a way to output the message");
        }
        else
            this.output = output;
    }

    public final MessageInput getInput() {
        return input;
    }

    public final void setInput(MessageInput input) {
        if (input == null) {
            throw new IllegalArgumentException("Their must be a way to input the message");
        }
        else
            this.input = input;
    }
}
