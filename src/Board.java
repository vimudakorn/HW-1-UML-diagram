// 6510405792 Vimudakorn Kittechapanich

import java.util.ArrayList;
import java.util.List;
public class Board {
    private List<Square> squares;

    Board() {
        squares = new ArrayList<>();
        squares.add(new Square("Goo!!!!"));
        squares.add(new Square("Trafalgar Square"));
        squares.add(new Square("Red Square"));
        squares.add(new Square("Saint Peter's Square"));
        squares.add(new Square("Piazza Navona"));
        squares.add(new Square("Zócalo"));
        squares.add(new Square("Dam Square"));
        squares.add(new Square("Plaza Mayor"));
        squares.add(new Square("Syntagma Square"));
        squares.add(new Square("Federation Square"));
        squares.add(new Square("Old Town Square"));
        squares.add(new Square("Rynek Główny"));
        squares.add(new Square("Grand Place"));
        squares.add(new Square("San Marco Square"));
        squares.add(new Square("Piccadilly Circus"));
        squares.add(new Square("Heroes' Square"));
        squares.add(new Square("Union Square"));
        squares.add(new Square("Constitution Square"));
        squares.add(new Square("George Square"));
        squares.add(new Square("Stortorget"));
        squares.add(new Square("King's Square"));
        squares.add(new Square("Alexanderplatz"));
        squares.add(new Square("Revolution Square"));
        squares.add(new Square("Saint Mark's Square"));
        squares.add(new Square("Gendarmenmarkt"));
        squares.add(new Square("Independence Square"));
        squares.add(new Square("Djemaa el-Fna"));
        squares.add(new Square("Palace Square"));
        squares.add(new Square("Rossio Square"));
        squares.add(new Square("Nathan Phillips Square"));
        squares.add(new Square("Victory Square"));
        squares.add(new Square("Saint Isaac's Square"));
        squares.add(new Square("Freedom Square"));
        squares.add(new Square("Catalonia Square"));
        squares.add(new Square("Wenceslas Square"));
        squares.add(new Square("Concorde Square"));
        squares.add(new Square("Civic Square"));
        squares.add(new Square("Central Square"));
        squares.add(new Square("Washington Square"));
        squares.add(new Square("Belmore Park Square"));
    }

    public Square getSquare(Square oldLoc , int fvTot) {
        int oldIndex = 0;
        for (int i = 0; i < squares.toArray().length; i++) {
            if (squares.get(i).getName().equals(oldLoc.getName())) {
                oldIndex = i;
                break;
            }
        }
        int newIndex = (oldIndex + fvTot) % squares.size();
        return squares.get(newIndex);
    }

    public Square getSquareAt(int index) {
        return squares.get(index);
    }
}
