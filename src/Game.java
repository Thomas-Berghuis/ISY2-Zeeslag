public class Game {
    private Board board;
    private Player[] players = new Player[2];
    private Player currentPlayer;
    private Player currentMove;
    private boolean isOver;
    public void start()
    {
        this.board = new Board(10, 10);
        this.isOver = false;
    }
}
