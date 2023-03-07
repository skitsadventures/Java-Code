/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rolling.dice;

import java.util.Random;

/**
 *
 * @author mackr
 */

public class RollingDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Die1 = (7);
        int Die2 = (7);
        Random rand = new Random();
        int [] chow = new int [12];
        int sum = 0;

        
        
        for (int i = 0; i < 12; i++){
            int int_random = rand.nextInt(Die1); 
            int int_random1 = rand.nextInt(Die1); 
            System.out.println((Die1-1) + " : "+ int_random);
            System.out.println((Die2-1) + " : "+ int_random1);
            //System.out.println(int_random + int_random1);
            chow[i] = int_random + int_random1;
        }
        for (int i : chow){
            sum = sum + i;
            System.out.println("Total: " + i);
        }
            System.out.println("Total amount from Rolls: " + sum);
    }
    
}
