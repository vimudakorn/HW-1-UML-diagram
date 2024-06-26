// 6510405792 Vimudakorn Kittechapanich

public class Piece {
    private String name;
    private Square location;

    Piece(String name) {
        this.name = name;
        location = new Board().getSquareAt(0);
    }
    public Square getLocation() {
        return location;
    }

    public void setLocation(Square newLoc) {
        location = newLoc;
    }
}
