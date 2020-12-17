package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> chessPieceList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                chessPieceList.add(ChessPiece.PAWN_WHITE);
            } else {
                chessPieceList.add(ChessPiece.ROOK_BLACK);
            }
        }

        for (ChessPiece chessPiece : chessPieceList) {
            System.out.print(chessPiece.toString() + " ");
        }
    }
}