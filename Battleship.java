public class Battleship {
    private boolean isSunk;
    private int healthValue;
    private int size;

    //Constructor of Battleship class.
    public Battleship(int size){
        this.isSunk = false;
        this.size = size;
        this.healthValue = size;  // health values are depended directly on size.
    }



}
