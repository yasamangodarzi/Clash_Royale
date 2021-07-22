package Game;

/**
 * The type Card.
 */
public class Card extends Playground{
    /**
     * The Card name.
     */
    protected String CardName;
    /**
     * The Cost.
     */
    protected int cost;

    /**
     * Gets card name.
     *
     * @return the card name
     */
    public String getCardName() {
        return CardName;
    }

    /**
     * Sets card name.
     *
     * @param cardName the card name
     */
    public void setCardName(String cardName) {
        CardName = cardName;
    }

    /**
     * Gets cost.
     *
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * Sets cost.
     *
     * @param cost the cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }


}
