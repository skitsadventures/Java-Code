/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trytoparsedouble;

import javax.swing.JOptionPane;

/**
 *
 * @author mackr
 */
public class TryToParseDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double inputDouble = 0.0;
        
        while (inputDouble != 99.0)
        {
           try 
           {
               String inputString = JOptionPane.showInputDialog(null, 
                   "Please enter a floating point number. To quit enter 99");
               inputDouble = Double.parseDouble(inputString);
           }
           catch(NumberFormatException exception)
           {
                inputDouble = 0;
                JOptionPane.showMessageDialog(null, "Error! You must enter a number");
           }
           if (inputDouble == 99.0)
                JOptionPane.showMessageDialog(null, "Goodbye!");
           else 
               JOptionPane.showMessageDialog(null, "You have entered " + inputDouble);
        } 
    }
    
}
