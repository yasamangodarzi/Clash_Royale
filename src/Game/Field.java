package Game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Field {
    private int[][] area = new int[23][18];
    HashMap<String,Integer> map=new HashMap<>();

    public Field() {
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 18; j++) {
                area[i][j] = 0;
            }
        }
        map.put("barbarians",1);
        map.put("",0);
        map.put("archer",2);
        map.put("babyDragon",3);
        map.put("wizard",4);
        map.put("pekka",5);
        map.put("giant",6);
        map.put("valkyrie",7);
        map.put("InfernoTower",8);
        map.put("Cannon",9);
    }

    public void show() {
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 18; j++) {
                System.out.print(area[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("----------------------------------------------------");
    }

    public void Change(Card card, int row, int clo) {
        area[clo][row] = map.get(card.getCardName());
    }
    public String lookup(Location location)
    {
        String s=getKey(map,area[location.getColumn()][location.getRow()]);
        return s;
    }
    public int[][] getArea() {
        return area;
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
