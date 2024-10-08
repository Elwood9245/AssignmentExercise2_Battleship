public class Square {

    //Square object attributes defination
    private int rowNum;
    private int columnNum;
    private boolean hasShip;
    private  Battleship battleship;
    private boolean hasFiredAt;

    //Constructor
    public Square(int rowNum, int columnNum){
        this.rowNum = rowNum;
        this.columnNum = columnNum;
        this.hasShip  = false;
        this.hasFiredAt = false;
    }

    //Getter and setter of Battleship.
    public Battleship getBattleship() {
        return battleship;
    }

    public void setBattleship(Battleship battleship) {
        this.hasShip = true;
        this.battleship = battleship;
    }

    //Shoot method, change the status of Square object.
    public boolean fireAt(){
        if (!hasFiredAt){
            hasFiredAt = true;
        }
    }



}
