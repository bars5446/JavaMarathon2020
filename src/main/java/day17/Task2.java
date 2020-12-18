package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(chessPiecesArray());
        chessBoard.print();
    }
    public static ChessPiece[][] chessPiecesArray() {
        ChessPiece[][] chessPiecesArray = new ChessPiece[8][8];
        /*
         Не могу понять, как именно по умолчанию создать массив с ChessPiece.EMPTY,
         по сути нужно циклом заполнять отдельным,
         но тогда какой смысл если во всложенном просто одна строчка это делает?
         Через sumIndex получилось избавиться от 9 строк и условия по приятнее стали,
         но больше ничего придумать не могу, есть ли вариант как то еще оптимизировать?
         */
        int sumIndex = 0;
        for (int i = 0; i < chessPiecesArray.length; i++){
            for (int j = 0; j < chessPiecesArray.length; j++) {
                sumIndex++;
                if (sumIndex == 1 || sumIndex == 6) {
                    chessPiecesArray[i][j] = ChessPiece.ROOK_BLACK;
                } else if (sumIndex == 7) {
                    chessPiecesArray[i][j] = ChessPiece.KING_BLACK;
                } else if (sumIndex == 10 || sumIndex == 62){
                    chessPiecesArray[i][j] = ChessPiece.ROOK_WHITE;
                } else if (sumIndex == 13 || sumIndex == 14 || sumIndex == 16 || sumIndex == 17 || sumIndex == 23) {
                    chessPiecesArray[i][j] = ChessPiece.PAWN_BLACK;
                } else if (sumIndex == 19) {
                    chessPiecesArray[i][j] = ChessPiece.KNIGHT_BLACK;
                } else if (sumIndex == 25 ) {
                    chessPiecesArray[i][j] = ChessPiece.QUEEN_BLACK;
                } else if (sumIndex == 28 || sumIndex == 45) {
                    chessPiecesArray[i][j] = ChessPiece.BISHOP_WHITE;
                } else if (sumIndex == 36) {
                    chessPiecesArray[i][j] = ChessPiece.BISHOP_BLACK;
                } else if (sumIndex == 37 || sumIndex == 46 || sumIndex == 49 || sumIndex == 54 || sumIndex == 56) {
                    chessPiecesArray[i][j] = ChessPiece.PAWN_WHITE;
                } else if (sumIndex == 52) {
                    chessPiecesArray[i][j] = ChessPiece.QUEEN_WHITE;
                } else if (sumIndex == 63) {
                    chessPiecesArray[i][j] = ChessPiece.KING_WHITE;
                } else {
                    chessPiecesArray[i][j] = ChessPiece.EMPTY;
                }
            }
        }
        return chessPiecesArray;
    }
}
