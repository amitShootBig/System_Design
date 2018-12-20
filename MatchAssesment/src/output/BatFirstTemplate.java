package output;

public class BatFirstTemplate extends Template {
	int runDiff;
	public BatFirstTemplate(String teamName, String bestBowler, String bestBatsman, String manOfThematch,int runDiff) {
		super(teamName, bestBowler, bestBatsman, manOfThematch);
		this.runDiff=runDiff;
	}
	 @Override
	public String printMsg() {
		String msg = teamName+" battingFirst, won the game by "+runDiff+" runs!! "+manOfThematch+" was declared Man Of the match. "
	               +bestBatsman+" was the highest runScorer and "+bestBowler+" bowled the best";
		return msg;
	}


}
