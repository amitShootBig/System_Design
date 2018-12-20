package GameOfChess;

import java.util.Scanner;

public class ChessApplication {

	public static void main(String[] args) throws Exception {
		ChessBoard board = new ChessBoard();
		Scanner input = new Scanner(System.in);
		for(int i =0;i<8;i++){
			for(int j=0;j<8;j++){
				String piece = input.next();
				if(piece.charAt(0)=='-'){
					board.positions[i][j].piece = null;
				}
				else{
				Piece pieceObj= new Piece(PieceEnum.valueOf(String.valueOf(piece.charAt(1))), piece.charAt(0));
				board.positions[i][j].piece = pieceObj;
				}
			}
			input.nextLine();
		}
		for(int k=0;k<1;k++){
		for(int i=0;i<3;i++){
		
		String pieceStr = input.next();
		String start = input.next();
		String end = input.next();
		board.makeMove(board, pieceStr, start, end);
		printBoard(board);
		}
		
		}
		
	}
	
	public static void printBoard(ChessBoard board){	
		for(int i =0;i<8;i++){
			for(int j=0;j<8;j++){
				if(board.positions[i][j].piece==null)
				{
					System.out.print("--");
				}
				else
				System.out.print(board.positions[i][j].piece.getColour()+board.positions[i][j].piece.getPieceType().name()+ " ");
			}
			System.out.println();
			}

	}

}
