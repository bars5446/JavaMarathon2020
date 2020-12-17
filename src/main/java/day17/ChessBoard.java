package day17;

public class ChessBoard {
    private ChessPiece[][] chessBoardArray;

    public ChessBoard(ChessPiece[][] chessBoardArray) {
        this.chessBoardArray = chessBoardArray;
    }

    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoardArray[i][j]);
            }
            System.out.println();
        }
    }
}
