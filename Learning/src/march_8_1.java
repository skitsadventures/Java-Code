/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mackr
 */

import java.util.ArrayList;
public class march_8_1 {
    
    public static void main (String[] args){
        ArrayList specialisations = new ArrayList ();
        ArrayList b = new ArrayList();
        b = specialisations;
        specialisations.add("Application");
        specialisations.add("Games");
        specialisations.add("Software");
        display(b);
    }
    public static void display(ArrayList b){
        System.out.println(b);


    }
}