package Game;

public class Location extends Playground{

    //filed
    private static int row;
    private static int column;

    //constructor
    public Location(int row, int column){
        Location.row = row;
        Location.column = column;
    }

    //method
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public static void setRow(int row) {
        Location.row = row;
    }

    public static void setColumn(int column) {
        Location.column = column;
    }

}
