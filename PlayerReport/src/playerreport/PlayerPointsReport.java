/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playerreport;

import javax.swing.JOptionPane;

/**
 *
 * @author mackr
 */
public class PlayerPointsReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1 = JOptionPane.showInputDialog("Enter qualifying points");
        String string2 = JOptionPane.showInputDialog("Enter semifinal points");
        String string3 = JOptionPane.showInputDialog("Enter final-match points");
        
        int quaterfinal = Integer.parseInt (string1);
        int semifinal = Integer.parseInt(string2);
        int finalmatch = Integer.parseInt(string3);
        
        PlayerReport pr = new PlayerReport(10, quaterfinal, semifinal, finalmatch);
        String report = pr.PlayerReport();
        JOptionPane.showMessageDialog(null, report);
    }
    
}