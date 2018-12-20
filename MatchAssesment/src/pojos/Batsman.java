package pojos;

public class Batsman extends Player {

	
	
	public Batsman(String name, String teamName, int runsScored, int catches, int runOuts,int stumps) {
		super(name, teamName, runsScored, catches, runOuts,stumps);
	
	}
	private int strikeRate;
	private int totalRunsScored;



	public int getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(int strikeRate) {
		this.strikeRate = strikeRate;
	}
	public int getTotalRunsScored() {
		return totalRunsScored;
	}
	public void setTotalRunsScored(int totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
@Override
public	void calculatePoints(){
	
		pointsForRun();
	}

}
