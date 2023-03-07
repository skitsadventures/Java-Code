/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playerreport;

/**
 *
 * @author mackr
 */
public class Player {
    int playerid;
    int quaterfinal;
    int semifinal;
    int finalmatch;
    
    
public Player (int playerID, int quaterFinal, int semiFinal, int finalMatch){    
    playerid = playerID;
    quaterfinal = quaterFinal;
    semifinal = semiFinal;
    finalmatch = finalMatch;
} 

public int getPlayerID(){
return playerid;
}

public int getQuaterFinal(){
return quaterfinal;
}

public int getSemiFinal(){
return semifinal;
}

public int getFinalMatch(){
return finalmatch;
}
}
