
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package artistsearchoop;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author mackr
 */
public class ArtistSearchOop 
{
    /**
     * @param args the command line arguments
     */
    

    interface salesSummary{
    int rowSum = 0;
    int colSum = 0;    
    }
//        class Deprived extends ArtistSearchOop{
//            void Indice(){
//                
//            int rowSum;
//            int colSum;
//            int salesSummary;   
//            }
//        }
//        
//        class Index extends Deprived{
//            void display(){
//            Indice();
//            super.Indice();
//        }
//        
        public static void main(String[] args) {
            int colSum; 
            int rowSum;
            int sumCol;
            int sumRow;
            int sum = 0;
            
            String[] Sales = new String[] {"Artist CD Sale :", "Artist DVD Sale :", "Artist Blue Ray Sale :", "Artist Total Sales :"};
            String[] ArtistName = new String[] {"Artist01", "Artist02", "Artist03", "Artist04", "Artist05", "Artist06","Artist07"};
            int[][] artistSales = {{98561, 4268468, 146777},{54353, 3256356, 1000000},{43545, 2536534, 643134},{45575, 9474466, 134664},{43786, 2334642, 245465},{35654, 9764566, 254666},{98561, 4268468, 146777}};

            
        for (int[] artistSale : artistSales) {
            sum = sum + artistSale[0];
        }
            
            rowSum = artistSales.length;
            colSum = artistSales[0].length;
            
            for(int i = 0; i < rowSum; i++){    
            sumRow = 0;    
            for(int j = 0; j < colSum; j++){    
              sumRow = sumRow + artistSales[i][j];    
            }    
    
            Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter a number from 0 to 6");
        
        String Answer = myObj.nextLine();
        
        if (null == Answer){
            System.out.println("incorrect number");
        }
        else switch (Answer) {
            case "0" -> System.out.println(ArtistName[0] + "\n" + Sales[0] + artistSales[0][0]
                + "\n" + Sales[1] + artistSales[0][1]
                + "\n" + Sales[2] + artistSales[0][2]
                + "\n" + ("Total : "+ sumRow));
            case "1" -> System.out.println(ArtistName[1] + "\n" + Sales[0] + artistSales[1][0]
                + "\n" + Sales[1] + artistSales[1][1]
                + "\n" + Sales[2] + artistSales[1][2]
                + "\n" + ("Total : "+ sumRow));
            case "2" -> System.out.println(ArtistName[2] + "\n" + Sales[0] + artistSales[2][0]
                + "\n" + Sales[1] + artistSales[2][1]
                + "\n" + Sales[2] + artistSales[2][2]
                + "\n" + ("Total : "+ sumRow));
            case "3" -> System.out.println(ArtistName[3] + "\n" + Sales[0] + artistSales[3][0]
                + "\n" + Sales[1] + artistSales[3][1]
                + "\n" + Sales[2] + artistSales[3][2]
                + "\n" + ("Total : "+ sumRow));
            case "4" -> {
                System.out.println(ArtistName[4] + "\n" + Sales[0] + artistSales[4][0]
                        + "\n" + Sales[1] + artistSales[4][1]
                        + "\n" + Sales[2] + artistSales[4][2]
                        + "\n" + ("Total : "+ sumRow));
                }
            case "5" -> {
                System.out.println(ArtistName[5] + "\n" + Sales[0] + artistSales[5][0]
                        + "\n" + Sales[1] + artistSales[5][1]
                        + "\n" + Sales[2] + artistSales[5][2]
                        + "\n" + ("Total : "+ sumRow));
                }
            case "6" -> {
                System.out.println(ArtistName[6] + "\n" + Sales[0] + artistSales[6][0]
                        + "\n" + Sales[1] + artistSales[6][1]
                        + "\n" + Sales[2] + artistSales[6][2]
                        + "\n" + ("Total : "+ sumRow));
                }
            default -> System.out.println("incorrect number");
        }
    }    
            
        //Calculates sum of each column of given matrix    
        for(int i = 0; i < colSum; i++){    
            sumCol = 0;    
            for(int j = 0; j < rowSum; j++){    
              sumCol = sumCol + artistSales[j][i];    
            }    
            //System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
            
        
    }
        
}
        // TODO code application logic here
