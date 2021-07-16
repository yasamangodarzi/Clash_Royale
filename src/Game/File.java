package Game;

// import ir.huri.jcal.JalaliCalendar;
 //import ir.huri.jcal.JalaliCalendar;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class File {
    private String Level;
    private ArrayList<String> HandsOfCards;
    private boolean ResultGame;

    public File(String Level, boolean ResultGame, ArrayList<String>HandsOfCards){
        this.Level = Level;
        this.HandsOfCards = HandsOfCards;
        this.ResultGame = ResultGame;
    }

    public void CreatFilePlayer() throws FileNotFoundException {
        String theEndResultOfGame = null;
        FileUtils file = new FileUtils();

          // JalaliCalendar jalaliCalendar = new JalaliCalendar();

     
     
        if(ResultGame)
            theEndResultOfGame = "Winner";
        else
            theEndResultOfGame = "Loser";
       //  InformationPlayer information = new InformationPlayer(theEndResultOfGame, HandsOfCards, jalaliCalendar.toString());
        file.creatDirectory("F:/ClashRoyal");
        //file.writeObject("F:/ClashRoyal/" + Level + ".txt", information);
    }
}
