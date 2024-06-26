// 6510405792 Vimudakorn Kittechapanich

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MGame {
    private int roundCnt;
    private List<Player> players;
    private Board board;

    private List<Die> dice;

    private int numOfPlayer;
    private int totalRound;

    MGame() {
        board = new Board();
        roundCnt = 0;
        dice = new ArrayList<>();
        dice.add(new Die());
        dice.add(new Die());
        players = new ArrayList<>();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Players [2-8] :");
        numOfPlayer = scanner.nextInt();
        Scanner round = new Scanner(System.in);
        System.out.print("Total Round : ");
        totalRound = round.nextInt();
        if (numOfPlayer >= 2 && numOfPlayer <= 8) {
            for (int i = 0; i < numOfPlayer; i++) {
                System.out.print("Name of Player " + (i+1) + " : ");
                Scanner scanner1 = new Scanner(System.in);
                String name = scanner1.next();
                System.out.print("Piece of Player " + (i+1) + " : ");
                Scanner scanner2 = new Scanner(System.in);
                String piece = scanner2.next();
                players.add(new Player(name , new Piece(piece) , board , dice));
            }
        }
        else {
            System.out.println("Players must be 2-8");
            System.exit(1);
        }
        for (int i = 0; i < totalRound; i++) {
            roundCnt++;
            System.out.println("Round : " +roundCnt);
            playRound();
        }
    }


    private void playRound() {
            for (int j = 0; j < players.toArray().length;j++) {
                players.get(j).takeTurn();
            }
        }
    }
