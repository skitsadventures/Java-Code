/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mackr
 */
import java.util.Scanner;
import java.util.Random;
public class Enudemo {
    
    public static void main(String[]args) {
        Random rand = new Random();
        int upperbound = 11;

        boolean flag = true;
        int credits;
        credits = 100; 
        
        int play_fee;
        
        System.out.println("======================");
        System.out.println("ELCOME TO YOU WILL ALWAYS LOSE");
        System.out.println("======================");
        System.out.println("WIN BIG OR GO HOME WITH NOTHING.....");
        System.out.println("======================");
        System.out.println("GET 3 OF THE SAME NUMBER TO WIN DOUBLE WHAT YOU PLAYED");
        System.out.println("======================");
        System.out.println("YOU CURRENTLY HAVE " + credits +  " CREDITS, HOW MUCH WOULD YOU LIKE TO PLAY?");
                
         Scanner myObj = new Scanner(System.in);
         while (flag){
             play_fee = myObj.nextInt();
             if (play_fee > credits){
                 flag = false;
                 System.out.println("you broke");
             }
             else {        
                    int int_random1 = rand.nextInt(upperbound);
                    int int_random2 = rand.nextInt(upperbound);
                    int int_random3 = rand.nextInt(upperbound);
                    System.out.println("-------- "+int_random1);
                    System.out.println("-------- "+int_random2);
                    System.out.println("-------- "+int_random3);
                    
                    if (int_random1 == int_random2 && int_random1 == int_random3){
                        System.out.println("you won");
                        credits = credits + play_fee * 2;
                    }
                    else{
                        System.out.println("you lost.");
                        credits = credits - play_fee;
                    }
                    System.out.println("play again?");
                    String ans = myObj.nextLine();
                    
                    if(ans != "Yes"){
                        flag = false;
                    }
             }
         }
         System.out.println("you have "+ credits);
         
    }
    
}
