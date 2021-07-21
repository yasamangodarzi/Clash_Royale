package Game;

import java.util.*;

public class DetermineHandCards{
    //filed
    private Map<Integer, ArrayList<Card>> setCardElixir = new HashMap<>();
    private ArrayList<Card> CardOfElixir = new ArrayList<>();
    private HashSet<Card> resultDeterminingCards = new HashSet<>();

    //constructor
    public DetermineHandCards(ArrayList<Card> PlayerCard){
        CardElixirSet();
        CardOfElixir = PlayerCard;
    }

    //method
    public void CardElixirSet(){
        Barbarians barbarians = new Barbarians();
        Archer archer = new Archer();
        BabyDragon babyDragon = new BabyDragon();
        Wizard wizard = new Wizard();
        PEKKA pekka = new PEKKA();
        Giant giant = new Giant();
        Valkyrie valkyrie = new Valkyrie();
        Rage rage = new Rage();
        FireBall fireBall = new FireBall();
        Arrows arrows = new Arrows();
        setCardElixir.computeIfAbsent(5, k ->new ArrayList<>()).add(barbarians);
        setCardElixir.computeIfAbsent(3, k ->new ArrayList<>()).add(archer);
        setCardElixir.computeIfAbsent(4, k ->new ArrayList<>()).add(babyDragon);
        setCardElixir.computeIfAbsent(5, k ->new ArrayList<>()).add(wizard);
        setCardElixir.computeIfAbsent(4, k ->new ArrayList<>()).add(pekka);
        setCardElixir.computeIfAbsent(5, k ->new ArrayList<>()).add(giant);
        setCardElixir.computeIfAbsent(4, k ->new ArrayList<>()).add(valkyrie);
        setCardElixir.computeIfAbsent(3, k ->new ArrayList<>()).add(rage);
        setCardElixir.computeIfAbsent(4, k ->new ArrayList<>()).add(fireBall);
        setCardElixir.computeIfAbsent(3, k ->new ArrayList<>()).add(arrows);
    }

    public HashSet<Card> DeterminingTheEndOfTheCards(int elixir, ArrayList<Card> PlayerCard){
        ArrayList<Card> ArrayForHashMap = new ArrayList<>();
        ArrayList<Card> ArrayForPlayGround = new ArrayList<>();
        while(elixir != 0) {
            for (int k = 0; k < setCardElixir.get(elixir).size(); k++) {
                ArrayForHashMap.add(setCardElixir.get(elixir).get(k));
            }
            elixir--;
        }
        for(int i = 0; i < ArrayForHashMap.size(); i++){
            for(int  j = 0; j < PlayerCard.size(); j++){
                if(ArrayForHashMap.get(i) == PlayerCard.get(j)){
                    ArrayForPlayGround.add(ArrayForHashMap.get(i));
                }
            }
        }
        //ArrayForPlayGround now has members of the cards that are both selected by the user and taken to the playground,
        // and are activated according to the number of elixirs (less equal).

        Random random = new Random();
        int randNumber1 = random.nextInt(ArrayForPlayGround.size());
        resultDeterminingCards.add(ArrayForPlayGround.get(randNumber1));
        ArrayForPlayGround.remove(randNumber1);
        PlayerCard.remove(randNumber1);
        int randNumber2 = random.nextInt(ArrayForPlayGround.size());
        resultDeterminingCards.add(ArrayForPlayGround.get(randNumber2));
        ArrayForPlayGround.remove(randNumber2);
        PlayerCard.remove(randNumber2);
        int randNumber3 = random.nextInt(ArrayForPlayGround.size());
        resultDeterminingCards.add(ArrayForPlayGround.get(randNumber3));
        ArrayForPlayGround.remove(randNumber3);
        PlayerCard.remove(randNumber3);

        for(int m = 0; m < PlayerCard.size(); m++){
            for(int n = 0; n < ArrayForPlayGround.size(); n++){
                if(PlayerCard.get(m) != ArrayForPlayGround.get(n)){
                    int randNumber4 = random.nextInt(PlayerCard.size());
                    resultDeterminingCards.add(ArrayForPlayGround.get(randNumber4));
                    PlayerCard.remove(randNumber4);
                }
                else{
                    int randNumber4 = (random.nextInt(ArrayForPlayGround.size()) + 1);
                    resultDeterminingCards.add(ArrayForPlayGround.get(randNumber4));
                    ArrayForPlayGround.remove(randNumber4);
                }
            }
        }
        return resultDeterminingCards;
    }

    public HashSet<Card> CreatOneCard(HashSet<Card> hashSet, ArrayList<Card> arrayList, Card card){
        hashSet.remove(card);
        while(hashSet.size() == 4) {
            Random random = new Random();
            int randomNumber = random.nextInt();
            hashSet.add(arrayList.get(randomNumber));
        }
        return hashSet;
    }
}
