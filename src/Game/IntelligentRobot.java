package Game;

import java.util.*;

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
       ArrayList<Playground> rivalCard = new ArrayList<>();
       ArrayList<Target> targetCard = new ArrayList<>();
       ArrayList<Card> cardShooting = new ArrayList<>();
       int randomNumber = 0;
       Card[] cardYouCanPlayList = cardYouCanPlay.toArray(new Card[cardYouCanPlay.size()]);
       Map<Target, ArrayList<Card>> map = new HashMap<>();
       for (Playground playground: rival
            ) {
           if(playground.alive){
               rivalCard.add(playground);
           }
       }
       for(int i = 3; i < cardYouCanPlayList.length; i++){
           map.computeIfAbsent(cardYouCanPlayList[i].target, k ->new ArrayList<>()).add(cardYouCanPlayList[i]);
       }
       boolean resultTarget;
       resultTarget = verifyAllEqualUsingHashSet(targetCard);

       if(resultTarget){
           createRandomCard();
       }
       else{
           Playground playground = new Playground();
           ArrayList<Playground> nearRivalCard = playground.DetectProximityTargetCard(0, 6,
                   rivalCard, 11.5);
           Target targetNearRivalCard = nearRivalCard.get(0).target;
           cardShooting = map.get(targetNearRivalCard);
           Random random = new Random();
           randomNumber = random.nextInt(cardShooting.size());
       }

       return cardShooting.get(randomNumber);
   }

    public boolean verifyAllEqualUsingHashSet(ArrayList<Target> list) {
        return new HashSet<Target>(list).size() <= 1;
    }

    @Override
    public void Play(){
        intelligentRobot();
    }

    public Location CreateRandomLocation(){
        ArrayList<Playground> rivalCard = new ArrayList<>();
        for (Playground playground: rival
        ) {
            if(playground.alive){
                rivalCard.add(playground);
            }
        }
        Playground playground = new Playground();
        ArrayList<Playground> nearRivalCard = playground.DetectProximityTargetCard(0, 6,
                rivalCard, 11.5);
        int rowRival = nearRivalCard.get(0).getLocation().getRow();
        int columnRival = nearRivalCard.get(0).getLocation().getColumn();
        Random random = new Random();
        int randomRangeRow = random.nextInt(rowRival + 5);
        int randomRangeColumn = random.nextInt(columnRival + 5);
        Location location = new Location();
        location.setRow(randomRangeRow);
        location.setColumn(randomRangeColumn);
        return location;
    }
}
