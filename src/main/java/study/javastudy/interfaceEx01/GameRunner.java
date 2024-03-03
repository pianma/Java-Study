package study.javastudy.interfaceEx01;

public class GameRunner {
    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        marioGame.up();
        marioGame.down();
        marioGame.right();
        marioGame.left();

        ChessGame chessGame = new ChessGame();
        chessGame.up();
        chessGame.down();
        chessGame.right();
        chessGame.left();
    }
}
