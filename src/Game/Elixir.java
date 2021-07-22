package Game;

public class Elixir extends CommonGameData{
    private int elixir;

    /**
     * Instantiates a new Elixir.
     */
    public Elixir() {
        this.elixir = 4;

    }

    /**
     * ChangeElixir.
     */

    public void Change(boolean b)
    {
        if (b)
        {
            elixir++;
        }
        else
        {
           elixir=+2;
        }
    }

    /**
     * Gets elixir.
     *
     * @return the elixir
     */
    public int getElixir() {
        return elixir;
    }

    /**
     * Sets elixir.
     *
     * @param elixir the elixir
     */
    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    /**
     * LowerElixir.
     *
     * @param lower the lower
     */
    public void lowerElixir(int lower)
    {
        //if lower
        setElixir( elixir-lower);
    }
}
