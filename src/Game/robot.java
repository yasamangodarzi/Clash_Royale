package Game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * The type Robot.
 */
public class robot extends Player{

    private ArrayList<Card> AllCard = new ArrayList<>();
    protected HashSet<Card> cardYouCanPlay=new HashSet<>();


    /**
     * Instantiates a new Robot.
     * @param username the username
     */
    public robot(String username, int xp) {
        super(username);
        super.setXp(xp);
        super.level();
        CreateRandomCardBot();
    }


    public void SetCardRobot(){
        AllCard.add(new Barbarians());
        AllCard.add(new Archer());
        AllCard.add(new BabyDragon());
        AllCard.add(new Wizard());
        AllCard.add(new Valkyrie());
        AllCard.add(new Giant());
        AllCard.add(new PEKKA());
        AllCard.add(new InfernoTower());
        AllCard.add(new Arrows());
        AllCard.add(new Rage());
        AllCard.add(new FireBall());
        AllCard.add(new Cannon());
        towers.add(new KingTower(level()));
        towers.add(new PrincessTower());
        towers.add(new PrincessTower());
    }


    /**
     * Create random row int.
     *
     * @return the int
     */
    public int createRandomRow(){
        Random random = new Random();
        int randomRow = (random.nextInt(18));
        return randomRow;
    }

    /**
     * Creat random column int.
     *
     * @return the int
     */
    public int createRandomColumn(){
        Random random = new Random();
        int randomColumn = random.nextInt(23);
        return randomColumn;
    }

    /**
     * Create random card card.
     * @return the card
     */
    public Card createRandomCard(){
        Random random = new Random();
        int randomCardNumber = random.nextInt(existCard.size());
        Card randomCard = existCard.get(randomCardNumber);
        existCard.remove(randomCardNumber);
        return randomCard;
    }

    public void CreateRandomCardBot(){
        SetCardRobot();
        for(int i = 0; i < 7; i ++){
            Random random = new Random();
            int randomNumber = random.nextInt(11);
            existCard.add(AllCard.get(randomNumber));
            AllCard.remove(randomNumber);
        }
    }

    public void Play(){
        createRandomCard();
    }
}
