public class Board {
    private final int boardWidth;
    private final int boardHeight;
    private char[][] board; // moet 3 chars kennen [onbekend][gemist][geraakt]
    public Board(int boardWidth, int boardHeight){
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        this.board = new char[boardWidth][boardHeight];
    }

    public boolean checkMove(int x, int y)
    {
        return ((x < this.boardWidth) && (y < boardHeight) && (x >= 0) && (y >= 0));
    }

}
