package Game;

public class Location {

    //filed
    private static int row;
    private static int column;

    //constructor
    public Location( ){

    }

    //method
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public   void setRow(int row) {
        Location.row = row;
    }

    public  void setColumn(int column) {
        Location.column = column;
    }
    @Override
    public String toString() {
        return "Location{" +
                "row=" + row+
                ", column=" + column +
                '}';
    }

}
