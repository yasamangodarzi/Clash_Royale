package Game;

import java.util.ArrayList;

public class IntelligentRobot extends robot{

    //filed
    private ArrayList<Playground> rival =new ArrayList<>();
  
    //constructor
    /**
     * Instantiates a new Robot.
     * @param username the username
     * @param xp
     */
    public IntelligentRobot(String username, int xp) {
        super(username, xp);
    }


   public Card intelligentRobot(){
       Card[] Geeks = cardYouCanPlay.toArray(new Card[cardYouCanPlay.size()]);
   }
}
