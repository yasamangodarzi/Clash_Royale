package Game;

import java.util.ArrayList;
import java.util.HashSet;

public class Player {
    private  String username="";
    private int level=0;
    private ArrayList<Card> card=new ArrayList();
    public ArrayList<Card> existCard=new ArrayList();
    public ArrayList<Tower> towers=new ArrayList();
    public File file;
    private int xp=0;
    public HashSet<Card> card1=new HashSet<>();

    public Player (String username) {
        level=level();
         this.username=username;
//         PrincessTower princessTower=new PrincessTower();
         Barbarians barbarians=new Barbarians();
         Archer archer=new Archer();
         archer.HP=100;
         barbarians.OpponentCard.add(archer);
 //         Valkyrie valkyrie=new Valkyrie();
//         barbarians.alive=true;
//         valkyrie.alive=true;
//         barbarians.HP=100;
//         valkyrie.HP=100;
//         princessTower.OpponentCard.add(barbarians);
//         princessTower.OpponentCard.add(valkyrie);
          existCard.add(new Barbarians());
          existCard.add(new Archer());
          existCard.add(new BabyDragon());
          existCard.add(new Wizard());
          existCard.add(new Valkyrie());
          existCard.add(new Giant());
          existCard.add(new PEKKA());
          existCard.add(new InfernoTower());
          towers.add(new KingTower(level()));
          towers.add(new PrincessTower());
          towers.add(new PrincessTower());
         // towers.add(princessTower);

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
        } if (xp>2500)
    {
        level=5;
        return 5;
    }
       return 0;
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
    public void Play(){

    }
}
