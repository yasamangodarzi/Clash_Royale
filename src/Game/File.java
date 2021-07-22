package Game;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
 * The type File.
 */
public class File {
    private String Level;
    private ArrayList<Card> HandsOfCards;
    /**
     * The Result game.
     */
    public boolean ResultGame;

    /**
     * Instantiates a new File.
     *
     * @param Level        the level
     * @param ResultGame   the result game
     * @param HandsOfCards the hands of cards
     */
    public File(String Level, boolean ResultGame, ArrayList<Card>HandsOfCards){
        this.Level = Level;
        this.HandsOfCards = HandsOfCards;
        this.ResultGame = ResultGame;
    }

    /**
     * Creat file player.
     *
     * @throws FileNotFoundException the file not found exception
     */
    public void CreatFilePlayer() throws FileNotFoundException {
        String theEndResultOfGame = null;
        FileUtils file = new FileUtils();
        Date date = new Date();
     
        if(ResultGame)
            theEndResultOfGame = "Winner";
        else
            theEndResultOfGame = "Loser";
         InformationPlayer information = new InformationPlayer(theEndResultOfGame, HandsOfCards, date.toString());
        file.creatDirectory("F:/ClashRoyal");
        file.writeObject("F:/ClashRoyal/" + Level + ".txt", information);
    }

    /**
     * This method has the ability to return a list of directories in a specific address
     *
     * @param name name file
     * @return array list
     */
    public ArrayList<String> listDirectory(String name) {
        java.io.File file = null;
        String[] paths;
        ArrayList<String> ArrayPath = new ArrayList<>();
        try {
            file = new java.io.File(name);
            paths = file.list();
            for (String path : paths) {
                ArrayPath.add(path);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ArrayPath;
    }
}
