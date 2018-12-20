package GameOfChess;

public class Piece {

	private PieceEnum pieceType;
	private char colour;
	private Position currentPosition;
	private boolean available;

	public Piece(PieceEnum pieceType, char colour) {
		super();
		this.pieceType = pieceType;
		this.colour = colour;
	}
	public PieceEnum getPieceType() {
		return pieceType;
	}
	public void setPieceType(PieceEnum pieceType) {
		this.pieceType = pieceType;
	}
	public char getColour() {
		return colour;
	}
	public void setColour(char colour) {
		this.colour = colour;
	}
	public Position getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(int si, int sj) {
		this.currentPosition = new Position(si,sj);
	}
	public void setAvailable(boolean avaialable) {
	this.available = avaialable;	
	}
	public boolean isAvailable() {
		return available;
	}
	
	public void capture(ChessBoard board, int si, int sj, int ei, int ej) {
		this.pieceType.capture(board, si, sj, ei, ej,this.colour);
	}
	
	
}
