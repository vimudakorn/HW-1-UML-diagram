// 6510405792 Vimudakorn Kittechapanich

import java.util.List;

public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private List<Die> dice;

    Player(String name , Piece piece , Board board , List<Die> dice) {
        this.name = name;
        this.piece = piece;
        this.board = board;
        this.dice = dice;
    }
    public void takeTurn() {
        System.out.println(name);
        int fvTot = 0;
        for (Die die:dice) {
            die.roll();
            fvTot += die.getFaceValue();
        }
        System.out.println(fvTot);
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc , fvTot);
        piece.setLocation(newLoc);
        System.out.println(piece.getLocation().getName());

    }
}
