package pojos;

public class Bowler extends Batsman {

 


public Bowler(String name, String teamName, int runsScored, int catches, int runOuts, int oversBowled,
			int maxOversToBeBowled, int runsConceded, int wicketsTaken, boolean isAllrounder,int maidens,int stumps) {
		super(name, teamName, runsScored, catches, runOuts,stumps);
		this.oversBowled = oversBowled;
		this.maxOversToBeBowled = maxOversToBeBowled;
		this.runsConceded = runsConceded;
		this.wicketsTaken = wicketsTaken;
		this.isAllrounder = isAllrounder;
		this.maidens=maidens;
	}
int oversBowled;
 int maxOversToBeBowled;
 int runsConceded;
 int wicketsTaken;
 boolean isAllrounder =false;
 int maidens;
 
public int getOversBowled() {
	return oversBowled;
}
public void setOversBowled(int oversBowled) {
	this.oversBowled = oversBowled;
}
public int getMaxOversToBeBowled() {
	return maxOversToBeBowled;
}
public void setMaxOversToBeBowled(int maxOversToBeBowled) {
	this.maxOversToBeBowled = maxOversToBeBowled;
}
public int getRunsConceded() {
	return runsConceded;
}
public void setRunsConceded(int runsConceded) {
	this.runsConceded = runsConceded;
}
public int getWicketsTaken() {
	return wicketsTaken;
}
public void setWicketsTaken(int wicketsTaken) {
	this.wicketsTaken = wicketsTaken;
}
public boolean isAllrounder() {
	return isAllrounder;
}
public void setAllrounder(boolean isAllrounder) {
	this.isAllrounder = isAllrounder;
}
@Override
public void calculatePoints(){
	individualScore+=wicketsTaken*5;
	individualScore+=maidens*2;
	if(wicketsTaken>=2){
		individualScore+=20;
	}
	pointsForRun();
	pointsForFielding();
	
}
}