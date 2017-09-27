/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author L117student
 */
public class TipService {
    
    public final double calculateTip(TipCalculator tipCalc) {
        if(tipCalc == null) {
            throw new IllegalArgumentException("A Tip Calculator is mandatory.");
        }
        return tipCalc.getTip();
    }
}
