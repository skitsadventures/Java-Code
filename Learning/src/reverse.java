/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mackr
 */
import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char ch;
        
        
        System.out.println("say something?");
        String str = input.nextLine();
        String Re="";
        for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);
        Re= ch+Re;
      }
        System.out.println(Re);
    }
}
