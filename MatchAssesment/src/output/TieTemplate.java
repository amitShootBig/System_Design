package output;

import pojos.Team;

public class TieTemplate extends Template {

	String otherTeamName = null;;
	public TieTemplate(String teamName, String bestBowler, String bestBatsman, String manOfThematch,String otherTeamName) {
		super(teamName, bestBowler, bestBatsman, manOfThematch);
		this.otherTeamName=otherTeamName;
	}
	 @Override
	public String printMsg() {
		String msg = "Match between "+teamName+" and "+otherTeamName+" ended in a tie"
	               +bestBatsman+" was the highest runScorer and "+bestBowler+" bowled the best";
		return msg;
	}
}
