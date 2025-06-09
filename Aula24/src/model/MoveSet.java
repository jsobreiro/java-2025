package model;

public class MoveSet {

    private String move1;
    private String move2;
    private String move3;
    private String move4;

    public MoveSet(String move1, String move2, String move3, String move4) {
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public String getMove1() { return move1; }
    public void setMove1(String move1) { this.move1 = move1; }
   
    public String getMove2() { return move2; }
    public void setMove2(String move2) { this.move2 = move2; }

    public String getMove3() { return move3; }
    public void setMove3(String move3) { this.move3 = move3; }

    public String getMove4() { return move4;}
    public void setMove4(String move4) { this.move4 = move4; }

    @Override
    public String toString() {
        return  "\nMovimentos:" +
                "\n#1: " + move1 +
                "\n#2: " + move2 +
                "\n#3: " + move3 +
                "\n#4: " + move4;
    }


    public String toText() {
        return move1 + ";" + move2 + ";" + move3 + ";" + move4;
    }
    
    public static MoveSet fromText (String moveSet) {

        String[] movimento = moveSet.split(";");
        return new MoveSet(movimento[0], movimento[1], 
                            movimento[2], movimento[3]);
    }
    

}
