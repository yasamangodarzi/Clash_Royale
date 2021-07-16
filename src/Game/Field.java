package Game;

import java.lang.reflect.Array;

public class Field {
    private int[][] area = new int[23][18];

    public Field() {
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 18; j++) {
                area[i][j] = 0;
            }
        }
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

    public void Change(int a, int row, int clo) {
        area[clo][row] = a;
    }

    public int[][] getArea() {
        return area;
    }
}
