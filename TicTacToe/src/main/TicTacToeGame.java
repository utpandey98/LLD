package main;

import main.model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Board board;
    Deque<Player> players;

    public TicTacToeGame() {
        initializeGame();
    }

    private void initializeGame() {
        this.board = new Board(3);

        Player player1 = new Player("player1", new PlayingPieceX());
        Player player2 = new Player("player2", new PlayingPieceO());

        players = new LinkedList<>();
        players.add(player1);
        players.add(player2);
    }

    public String startGame() {

        boolean isNoWinner = true;

        while (isNoWinner) {
            Player playerTurn = players.removeFirst();

            board.printBoard();

            List<String> freeSpaces = board.getFreeCells();
            if(freeSpaces.isEmpty()) {
                isNoWinner = false;
                continue;
            }

            System.out.print(playerTurn.getPlayerName() + "'s turn." + " Enter the coordinates you want to place your piece in (x,y): ");
            Scanner sc = new Scanner(System.in);
            String location = sc.nextLine();
            String[] coordinates = location.split(",");
            int row = Integer.parseInt(coordinates[0]), col = Integer.parseInt(coordinates[1]);
            Boolean canPlacePiece = board.placePiece(playerTurn.getPlayingPiece(), row, col);

            if (!canPlacePiece) {
               System.out.print("Invalid position. Please try a different position");
               players.addFirst(playerTurn);
               continue;
            }

            players.addLast(playerTurn);
            Boolean checkIfWinner = checkWinner(playerTurn, row, col);
            if(checkIfWinner) {
                board.printBoard();
                return playerTurn.getPlayerName();
            }
        }
        return "Tie";
    }

    private Boolean checkWinner(Player player, int row, int col) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for(int i=0; i < board.getSize(); i++) {
            if (board.getBoard()[i][col] == null || board.getBoard()[i][col] != player.getPlayingPiece()) {
                rowMatch = false;
            }
        }

        for(int j = 0; j < board.getSize(); j++) {
            if (board.getBoard()[row][j] == null || board.getBoard()[row][j] != player.getPlayingPiece()) {
                columnMatch = false;
            }
        }

        for(int i=0, j=0; i<board.getSize();i++,j++) {
            if (board.getBoard()[i][j] == null || board.getBoard()[i][j] != player.getPlayingPiece()) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.getSize()-1; i<board.getSize();i++,j--) {
            if (board.getBoard()[i][j] == null || board.getBoard()[i][j] != player.getPlayingPiece()) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
