/******************************************************************************
* Program Name:         Weight Loss Calculator 
* Program Description:  This program calculates how much weight would be loss 
* from a user inputted starting weight over the course of a user inputted length
* of time in weeks at a user inputted target percentage of body weight lost per 
* week
* 
* Program Author:       Jonathan Mielec
* Date Created:         12/4/2022
* Change#       Change Date     Programmer Name         Description
* -------       ------------    -------------------     -----------------------
******************************************************************************/
package weightlosscalculator;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JOptionPane;
public class WeightLossCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        // Decimal format
        DecimalFormat df = new DecimalFormat("####");
        String rate = JOptionPane.showInputDialog("Enter the targeted percentage of bodyweight lost per week (i.e. enter 1 for 1%:"); 
        String unit = JOptionPane.showInputDialog("Enter desired measurement unit (kgs or lbs)"); 
        String weight = JOptionPane.showInputDialog("Enter Starting weight: ");        
        String time = JOptionPane.showInputDialog("Enter length of diet in weeks: ");
        double w = Double.parseDouble(weight); // kg
        double startingWeight = w;
        double rateLoss = Double.parseDouble(rate) / 100; // kg
        double t = Double.parseDouble(time); // weeks
        for (int i = 0; i < t; i++) {
            w = (w - (w * rateLoss));
        }
        double fatLoss = startingWeight - w;
        String output = "The new weight after " + t + " weeks of losing " + rate + "% per week is " + df.format(w) + " " + unit + " for " + df.format(fatLoss) + " " + unit + " of fat loss";
        JOptionPane.showMessageDialog(null, output);
    }
    
}
