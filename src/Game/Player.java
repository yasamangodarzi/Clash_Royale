package Game;

import java.util.ArrayList;

public class Player {
    private  String username="";
    private int level=0;
    private ArrayList<Card> card=new ArrayList();
    public ArrayList<Card> existCard=new ArrayList();
    public ArrayList<Tower> towers=new ArrayList();
    public File file;

    private int xp=0;

    public Player (String username) {
        level=level();
         this.username=username;
          existCard.add(new Barbarians());
          existCard.add(new Archer());
          existCard.add(new BabyDragon());
          existCard.add(new Wizard());
          existCard.add(new Valkyrie());
          existCard.add(new Giant());
          existCard.add(new PEKKA());
          existCard.add(new InfernoTower());
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

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    public void setUsername(String username) {
        this.username = username;
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
        if (xp >= -1 && xp < 500)
        {
            level=1;
            return 1;
        }if (xp >= 500 && xp < 900)
        {
            level=2;
            return 2;
        }if (xp >= 900 && xp < 1700)
        {
            level=3;
            return 3;
        }if (xp >= 1700 && xp < 2500)
        {
            level=4;
            return 4;
        }
        level=5;
        return 5;
    }

    @Override
    public String toString() {
        return "Player{" +
                "username='" + username + '\'' +
                ", level=" + level +
                ", card=" + card +
                ", existCard=" + existCard +
                ", towers=" + towers +
                ", xp=" + xp +
                '}';
    }
}
