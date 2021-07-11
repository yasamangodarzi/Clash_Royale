package Game;

public class Card extends CommonGameData{
    protected String CardName;
   protected int cost;

    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

//    public List<String> DetectProximityTargetCard(){
//
//    }

}
