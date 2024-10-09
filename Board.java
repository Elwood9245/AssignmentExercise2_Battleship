public class Board {
    private int rows;
    private int columns;
    private Square[][] tables;

    public void Board(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.tables =  new Square[rows][columns];
    }

    //Print the board table on terminal.
    private void initialiseBoard(){
        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < columns; ++j){
                tables[i][j] = new Square(i,j);
            }
        }
    }

}
