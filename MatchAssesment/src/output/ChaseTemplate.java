package output;

public class ChaseTemplate extends Template {
	int wicketsLeft;
 public ChaseTemplate(String teamName, String bestBowler, String bestBatsman, String manOfThematch,int wicketsLeft) {
		super(teamName, bestBowler, bestBatsman, manOfThematch);
		this.wicketsLeft = wicketsLeft;
	}
 
 @Override
 public String printMsg() {
		String msg = teamName+" chased successfully and won the game by "+wicketsLeft+" wickets!! "+manOfThematch+" was declared Man Of the match. "
	               +bestBatsman+" was the highest runScorer and "+bestBowler+" bowled the best";
		return msg;
	}
}
