/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author mackr
 */
public class Date {
    

    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println(" How many days?");
        String Day = myScanner.nextLine();
        
        System.out.println(" How many weeks?");
        String Week = myScanner.nextLine();
        
        System.out.println(Day + " days " + Week + " weeks");
    }    
}
