package sample;

import Game.Field;
import Game.File;
import Game.Location;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.HashMap;
import java.util.Map;
//import finalPacman.PacManModel.CellValue;

public class ClashRoyaleView extends Group {
    public final static double CELL_WIDTH = 20.0;

    private int rowCount;
    private int columnCount;
    private ImageView[][] cellViews;
    // for chose Card
    private Image ValkyrieCard;
    private Image WizardCard;
    private Image RageCard;
    private Image InfernoTowerCard;
    private Image GiantCard;
    private Image FireBallCard;
    private Image ArcherCard;
    private Image ArrowsCard;
    private Image BabyDragonCard;
    private Image BarbariansCard;
    private Image CannonCard;
    private Image PEKKACard;
    // for chose Card
    private Image Valkyrie;
    private Image Wizard;
    private Image InfernoTower;
    private Image Giant;
    private Image Archer;
    private Image BabyDragon ;
    private Image Barbarians ;
    private Image Cannon ;
    private Image PEKKA ;
    private Image KingTower ;
    private Image PrinceTower ;
    HashMap<Image,String> map=new HashMap<>();


    /**
     * Initializes the values of the image instance variables from files
     */
    public ClashRoyaleView() {
        // for chose Card
        map.put(null,"");
       this.ValkyrieCard=new Image(getClass().getResourceAsStream("/sample/v.png"));
       map.put(ValkyrieCard,"Valkyrie");
       this.InfernoTowerCard=new Image(getClass().getResourceAsStream("/sample/result.png"));
        map.put(InfernoTowerCard,"InfernoTower");
       this.RageCard=new Image(getClass().getResourceAsStream("/sample/rage.png"));
       // map.put(InfernoTowerCard,"InfernoTower");
       this.PEKKACard =new Image(getClass().getResourceAsStream("/sample/MiniPEKKACard.png"));
        map.put(PEKKACard,"PEKKA");
       this.WizardCard =new Image(getClass().getResourceAsStream("/sample/images-removebg-preview.png"));
        map.put(WizardCard,"Wizard");
       this.GiantCard =new Image(getClass().getResourceAsStream("/sample/GiantCard.png"));
        map.put(GiantCard,"Giant");
       this.CannonCard=new Image(getClass().getResourceAsStream("/sample/CannonCard.png"));
        map.put(CannonCard,"Cannon");
       this.BarbariansCard=new Image(getClass().getResourceAsStream("/sample/BarbariansCard.png"));
        map.put(BarbariansCard,"Barbarians");
       this.BabyDragonCard=new Image(getClass().getResourceAsStream("/sample/baby-dragon.png"));
        map.put(BabyDragonCard,"BabyDragon");
       this.ArcherCard=new Image(getClass().getResourceAsStream("/sample/archers.png"));
        map.put(ArcherCard,"Archer");
       this.ArrowsCard=new Image(getClass().getResourceAsStream("/sample/ArrowsCard.png"));
       this.FireBallCard=new Image(getClass().getResourceAsStream("/sample/FireballCard.png"));
       this.KingTower=new Image(getClass().getResourceAsStream("/sample/towerRound_sampleB_E.png"));
       this.PrinceTower=new Image(getClass().getResourceAsStream("/sample/towerRound_sampleC_W.png"));
    }

    /**
     * Constructs an empty grid of ImageViews
     */
    private void initialize() {
        cellViews = new ImageView[rowCount][columnCount];
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                ImageView imageView = new ImageView();
                imageView.setX(column * CELL_WIDTH);
                imageView.setY(row * CELL_WIDTH);
                imageView.setFitWidth(CELL_WIDTH);
                imageView.setFitHeight(CELL_WIDTH);
                cellViews[row][column] = imageView;
                this.getChildren().add(imageView);
            }
        }
        ImageView imageView=new ImageView();
        imageView.setImage(KingTower);
        ImageView imageView1=new ImageView();
        imageView1.setImage(PrinceTower);
        ImageView imageView2=new ImageView();
        imageView2.setImage(PrinceTower);
        cellViews[0][3] = imageView1;
        cellViews[0][15] = imageView1;
        cellViews[0][9] = imageView;
    }
   public void update()
   {
      Field field= Main.gameManagement.field;
      int[][] area=field.getArea();
      for (int i=0;i<23;i++)
      {
          for (int j=0;j<18;j++)
          {
              Location location=new Location();
              location.setColumn(i);
              location.setRow(j);
              String string=field.lookup(location);
              ImageView imageView=new ImageView();
              imageView.setImage(getKey(map,string));
              cellViews[i][j] = imageView;
          }
      }

   }


    public int getRowCount() {
        return this.rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
        this.initialize();
    }

    public int getColumnCount() {
        return this.columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
        this.initialize();
    }

    public <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

}
