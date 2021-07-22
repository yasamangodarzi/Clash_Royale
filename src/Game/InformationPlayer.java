package Game;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * The type Information player.
 */
public class InformationPlayer implements Serializable {
    private String ResultGame;
    private ArrayList<Card> HandsOfCards;
    private String data;

    /**
     * Instantiates a new Information player.
     *
     * @param ResultGame   the result game
     * @param HandsOfCards the hands of cards
     * @param data         the data
     */
    public InformationPlayer(String ResultGame, ArrayList<Card>HandsOfCards, String data){
        this.ResultGame = ResultGame;
        this.data = data;
//        ArrayList<String>HandsOfCards = new ArrayList<>();
        this.HandsOfCards = HandsOfCards;
    }


    /**
     * Is result game string.
     *
     * @return the string
     */
    public String isResultGame() {
        return ResultGame;
    }

    /**
     * Sets result game.
     *
     * @param resultGame the result game
     */
    public void setResultGame(String resultGame) {
        ResultGame = resultGame;
    }

    /**
     * Gets hands of cards.
     *
     * @return the hands of cards
     */
    public ArrayList<Card> getHandsOfCards() {
        return HandsOfCards;
    }

    /**
     * Sets hands of cards.
     *
     * @param handsOfCards the hands of cards
     */
    public void setHandsOfCards(ArrayList<Card> handsOfCards) {
        HandsOfCards = handsOfCards;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(String data) {
        this.data = data;
    }
}
