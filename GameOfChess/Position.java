package GameOfChess;

class Position{
	int ci;
	int cj;
	Piece piece;

	public Position(int ci, int cj) {
		super();
		this.ci = ci;
		this.cj = cj;
	}
	
	 public void occupySpot(Piece piece){
	        //if piece already here, delete it, i. e. set it dead
	        if(this.piece != null)
	            this.piece.setAvailable(false);
	        //place piece here
	        this.piece = piece;
	    }

	    public boolean isOccupied() {
	        if(piece != null)
	            return true;
	        return false;
	    }

	    public Piece releasePosition() {
	        Piece releasedPiece = this.piece;
	        this.piece = null;
	        return releasedPiece;
	    }
	
	
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getCj() {
		return cj;
	}
	public void setCj(int cj) {
		this.cj = cj;
	}	
}