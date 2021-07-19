package Game;

import java.io.Serializable;
import java.util.ArrayList;

public class InformationPlayer implements Serializable {
    private String ResultGame;
    private ArrayList<Card> HandsOfCards;
    private String data;

    public InformationPlayer(String ResultGame, ArrayList<Card>HandsOfCards, String data){
        this.ResultGame = ResultGame;
        this.data = data;
//        ArrayList<String>HandsOfCards = new ArrayList<>();
        this.HandsOfCards = HandsOfCards;
    }


    public String isResultGame() {
        return ResultGame;
    }

    public void setResultGame(String resultGame) {
        ResultGame = resultGame;
    }

    public ArrayList<Card> getHandsOfCards() {
        return HandsOfCards;
    }

    public void setHandsOfCards(ArrayList<Card> handsOfCards) {
        HandsOfCards = handsOfCards;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
