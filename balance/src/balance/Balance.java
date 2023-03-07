/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package balance;

import java.util.*;

/**
 *
 * @author mackr
 */
public class Balance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyboard = new Scanner(System.in);
        int balances[] = new int[2];
        Random num = new Random();
        balances[0] = num.nextInt(100) + 1;
        balances[1] = num.nextInt(1000) + 1;
	System.out.println("1. Display checking account balance");
	System.out.println("2. Display savings account balance");
	System.out.print("Your choice: ");
	int choice = keyboard.nextInt();
        
        if (choice == 1) {
            if (balances[0] < 10) {
                
		System.out.println("Checking account balance is low");
            } 
        
            else {
            
                System.out.println("Checking account balance is " + balances[0]);
            }   
	} 
        else {
            if (balances[1] < 100) {
                
		System.out.println("Savings account balance is low");
            } 
            else {
                
		System.out.println("Savings account balance is " + balances[1]);
            }
	}


		keyboard.close();
    }
}
    
