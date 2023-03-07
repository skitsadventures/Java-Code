
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mackr
 */
public class Balance {
    public static void main(String[] args) {
        int[] Balances = {};
        Random random = new Random();
        for (int i = 0; i < 100; i++)
        {
            Balances[i] = random.nextInt(1, 100);
            System.out.println(Balances);
        }
        
    }
}