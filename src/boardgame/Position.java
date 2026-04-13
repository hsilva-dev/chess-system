package boardgame;

public class Position {

    private int rows;
    private int columns;

    public Position(int column, int row) {
        this.columns = column;
        this.rows = row;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return rows + ", " + columns;
    }

}
