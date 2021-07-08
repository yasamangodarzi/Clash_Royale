package Game;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> card=new ArrayList();
    public ArrayList<Card> existCard=new ArrayList();
    public ArrayList<Tower> towers=new ArrayList();
    private int xp=0;

    public Player () {
          existCard.add(new Barbarians());
          existCard.add(new Archer());
          existCard.add(new BabyDragon());
          existCard.add(new Wizard());
          existCard.add(new Valkyrie());
          existCard.add(new Giant());
          existCard.add(new PEKKA());
          towers.add(new KingTower());
          towers.add(new PrincessTower());
          towers.add(new PrincessTower());

    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getXp() {
        return xp;
    }

    public ArrayList<Card> getExistCard() {
        return existCard;
    }

    public void ChangeXp(int xp)
    {
        this.xp=+xp;
    }
    public int level()
    {
        if (xp >= 0 && xp < 500)
        {
            return 1;
        }if (xp >= 500 && xp < 900)
        {
            return 2;
        }if (xp >= 900 && xp < 1700)
        {
            return 3;
        }if (xp >= 1700 && xp < 2500)
        {
            return 4;
        }
        return 5;
    }
}
