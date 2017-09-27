package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {

    public static void main(String[] args) {
        
        TipCalculator foodService =  new FoodServiceTipCalculator(ServiceQuality.GOOD, 100.00);
        TipCalculator baggageService = new BaggageServiceTipCalculator(ServiceQuality.POOR, 10);
        
        TipService tipCalc = new TipService();
        
        double tip = tipCalc.calculateTip(foodService);
        
        System.out.println("Your tip on this bill would be " + tip);
        
        tip = tipCalc.calculateTip(baggageService);
        
        System.out.println("Your tip on this amount of bags would be " + tip);
    }
    
    

}
