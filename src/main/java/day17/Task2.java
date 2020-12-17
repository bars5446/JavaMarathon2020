package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(chessPiecesArray());
        chessBoard.print();
    }
    public static ChessPiece[][] chessPiecesArray() {
        ChessPiece[][] chessPiecesArray = new ChessPiece[8][8];
        // Решил сделать через if. Посмотрел видео про switch, я так понял про него лучше забыть?
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                if (i == 0 && (j == 0 || j == 5)) {
                    chessPiecesArray[i][j] = ChessPiece.ROOK_BLACK;
                } else if (i == 0 && j == 6) {
                    chessPiecesArray[i][j] = ChessPiece.KING_BLACK; // Заполнена линия - 1 (отсчет сверху вниз)
                } else if (i == 1 && j == 1){
                    chessPiecesArray[i][j] = ChessPiece.ROOK_WHITE;
                } else if (i == 1 && ((j == 4 || j == 5) || j == 7)) {
                    chessPiecesArray[i][j] = ChessPiece.PAWN_BLACK; // Заполнена линия - 2
                } else if (i == 2 && (j == 0 || j == 6)) {
                    chessPiecesArray[i][j] = ChessPiece.PAWN_BLACK;
                } else if (i == 2 && j == 2) {
                    chessPiecesArray[i][j] = ChessPiece.KNIGHT_BLACK; // Заполнена линия - 3
                } else if (i == 3 && j == 0 ) {
                    chessPiecesArray[i][j] = ChessPiece.QUEEN_BLACK;
                } else if (i == 3 && j == 3) {
                    chessPiecesArray[i][j] = ChessPiece.BISHOP_WHITE; // Заполнена линия - 4
                } else if (i == 4 && j == 3) {
                    chessPiecesArray[i][j] = ChessPiece.BISHOP_BLACK;
                } else if (i == 4 && j == 4) {
                    chessPiecesArray[i][j] = ChessPiece.PAWN_WHITE; // Заполнена линия - 5
                } else if (i == 5 && j == 4) {
                    chessPiecesArray[i][j] = ChessPiece.BISHOP_WHITE;
                } else if (i == 5 && j == 5) {
                    chessPiecesArray[i][j] = ChessPiece.PAWN_WHITE; // Заполнена линия - 6
                } else if (i == 6 && j == 3) {
                    chessPiecesArray[i][j] = ChessPiece.QUEEN_WHITE;
                } else if (i == 6 && (j == 0 || j == 5 || j == 7)) {
                    chessPiecesArray[i][j] = ChessPiece.PAWN_WHITE; // Заполнена линия - 7
                } else if (i == 7 && j == 5) {
                    chessPiecesArray[i][j] = ChessPiece.ROOK_WHITE;
                } else if (i == 7 && j == 6) {
                    chessPiecesArray[i][j] = ChessPiece.KING_WHITE; // Заполнена линия - 8
                } else {
                    chessPiecesArray[i][j] = ChessPiece.EMPTY;
                }
            }
        }
        return chessPiecesArray;
    }
}
