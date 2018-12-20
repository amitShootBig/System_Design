package GameOfChess;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
	 Position[][] positions = new Position[8][8];

	 public ChessBoard() {
	        for(int i=0; i<positions.length; i++){
	            for(int j=0; j<positions.length; j++){
	                this.positions[i][j] = new Position(i, j);
	            }
	        }
	    }
List<Piece> pieces = new ArrayList<Piece>();

public void makeMove(ChessBoard board,String pieceStr,String start,String end) throws Exception{
	//consume the move entered
	//check for capture
	//updatePosition
	int length = pieceStr.length();
	if(length>2){
		throw new Exception("Invalid move");
	}
	else {
		 char colour = pieceStr.charAt(0);
		 PieceEnum pieceEnum = PieceEnum.valueOf(String.valueOf(pieceStr.charAt(1)));
		 Piece piece = new Piece(pieceEnum, colour);
		 int si = Character.getNumericValue((start.charAt(0)));
		 int sj = Character.getNumericValue((start.charAt(1)));
		 int ei = Character.getNumericValue(end.charAt(0));
		 int ej = Character.getNumericValue(end.charAt(1));
		 piece.setCurrentPosition(si,sj);
		 boolean isMoveValid = pieceEnum.validateMove(si, sj, ei, ej);
		 if(isMoveValid){
			 move(board,piece,si,sj,ei,ej);
		 }
		 else{
			throw new Exception("Invalid move");
		 }
	}
}

public void move(ChessBoard board, Piece piece, int si, int sj, int ei, int ej){
	piece.capture(board, si, sj, ei, ej);
}

public void updatePosition(){
	
}


}
