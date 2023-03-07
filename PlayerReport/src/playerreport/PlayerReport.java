/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playerreport;

/**
 *
 * @author mackr
 */
public class PlayerReport extends Player{
        
        public PlayerReport(int playerID, int quaterFinal, int semiFinal, int finalMatch){
            super(playerID, quaterFinal, semiFinal, finalMatch);
        }
        public String PlayerReport(){
        
                int finalresult = quaterfinal + semifinal + finalmatch;
                String output = 
                        "Quater Final Points: " + quaterfinal + "\n" 
                        +"Semi Final Points: " +semifinal +"\n"
                        +"Final Match Points: "+ finalmatch;
                return output;
        
        }
}
