package GameOfChess;

import java.lang.Math;

public enum PieceEnum {
P("PAWN"){
	@Override
	public boolean validateMove(int si, int sj, int ei, int ej) {
		boolean straightMove = true;
		boolean validMove = false;
		if(!arePositionsValid(si, sj, ei, ej)){
			return false;
		}
		int dist=Math.abs(si-ei);
		if(sj!=ej){
			straightMove = false;
		}
		if(dist==1 && straightMove){
			validMove = true;
		}
		else{
			int verticalCross = Math.abs(si-ei);
			int horsizontalCross = Math.abs(sj-ej);
			if(verticalCross==1 && horsizontalCross==1){
				validMove=true;
			}
		}
		return validMove;
	}
	
	@Override
	public void capture(ChessBoard board, int si, int sj, int ei, int ej, char colour) {
		int verticalCross = Math.abs(si-ei);
		int horsizontalCross = Math.abs(sj-ej);
		if(verticalCross==1 && horsizontalCross==1){
			board.positions[ei][ej].occupySpot(new Piece(this,colour));
			board.positions[si][sj].releasePosition();
		}
		else if(board.positions[ei][ej].piece==null){
			board.positions[ei][ej].occupySpot(new Piece(this,colour));
			board.positions[si][sj].releasePosition();
		}
		else
		{
			System.out.println("Cannot occupy, someboday already there");
		}
	}
},
Q("QUEEN"){
	@Override
	public boolean validateMove(int si, int sj, int ei, int ej) {
		// TODO Auto-generated method stub
		return PieceEnum.R.validateMove(si, sj, ei, ej)||PieceEnum.B.validateMove(si, sj, ei, ej);
	}
	public void capture(ChessBoard board, int si, int sj, int ei, int ej, char colour) {
		// TODO Auto-generated method stub
		for(int i=si;i<ei;i++){
			for(int j=sj;j<ej;j++){
				if(this.validateMove(si, sj, i, j)){
			       if(board.positions[ei][ej].piece.getColour()==colour){
			    	   System.out.println("Cannot occupy, some colour already there");
			       }
					board.positions[ei][ej].occupySpot(new Piece(this,colour));
					return;
				}
			}
		}
	}
},
H("HORSE"){
	@Override
	public boolean validateMove(int si, int sj, int ei, int ej) {
		boolean valid = false;
		int x = Math.abs(si-ei);
		int y =Math.abs(sj-ej);
		if(x==2 && y==1){
			valid = true;
		}
		else if(y==2 && x==1){
			valid = true;
		}
		return valid;
	}
	
	@Override
	public void capture(ChessBoard board, int si, int sj, int ei, int ej, char colour) {
		// TODO Auto-generated method stub
	
					board.positions[ei][ej].occupySpot(new Piece(this,colour));

	}
},
R("ROOK"){
	@Override
	public boolean validateMove(int si, int sj, int ei, int ej) {
		boolean valid = false;
		if(ej==sj || si==ei)
			valid = true;
		return valid;
	}
	@Override
	public void capture(ChessBoard board, int si, int sj, int ei, int ej, char colour) {
		// TODO Auto-generated method stub
		for(int i=si;i<ei;i++){
			for(int j=sj;j<ej;j++){
				if(this.validateMove(si, sj, i, j)){
					board.positions[ei][ej].occupySpot(new Piece(this,colour));
					return;
				}
			}
		}
	}
},
B("BISHOP"){
	@Override
	public boolean validateMove(int si, int sj, int ei, int ej) {
		boolean valid = false;
		int x = Math.abs(si-ei);
		int y =Math.abs(sj-ej);
		if(x==y){
			valid = true;
		}
		return valid;
	}
	public void capture(ChessBoard board, int si, int sj, int ei, int ej, char colour) {
		// TODO Auto-generated method stub
		for(int i=si;i<ei;i++){
			for(int j=sj;j<ej;j++){
				if(this.validateMove(si, sj, i, j)){
					board.positions[ei][ej].occupySpot(new Piece(this,colour));
					return;
				}
			}
		}
	}
},
K("KING"){
	@Override
	public boolean validateMove(int si, int sj, int ei, int ej) {
		// TODO Auto-generated method stub
		return super.validateMove(si, sj, ei, ej);
	}
};

public String description;
PieceEnum(String description){
	this.description = description;
}
public boolean validateMove(int si,int sj,int ei, int ej){
return false;
}
public void capture(ChessBoard board,int si,int sj,int ei, int ej, char colour){

	
}

public boolean arePositionsValid(int si,int sj,int ei, int ej){
	boolean isValid =(si>0&&si<7)&&(ei>0&&ei<7)&&(sj>0&&sj<7)&&(ej>0&&ej<7);
	return isValid;
}
}
