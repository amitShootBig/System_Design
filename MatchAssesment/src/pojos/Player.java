package pojos;

public class Player {
    
	int id;
	String name;
	String teamName;
	int runsScored;
	int individualScore;
	int catches;
	int runOuts;
	int stumps;
	
	public Player(String name, String teamName, int runsScored,int catches,int runOuts,int stumps) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.runsScored = runsScored;
		this.catches=catches;
		this.runOuts = runOuts;
		this.stumps=stumps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getIndividualScore() {
		return individualScore;
	}
	public void setIndividualScore(int individualScore) {
		this.individualScore = individualScore;
	}
	public int getCatches() {
		return catches;
	}
	public void setCatches(int catches) {
		this.catches = catches;
	}
	public int getRunOuts() {
		return runOuts;
	}
	public void setRunOuts(int runOuts) {
		this.runOuts = runOuts;
	}
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStumps() {
		return stumps;
	}
	public void setStumps(int stumps) {
		this.stumps = stumps;
	}
public void calculatePoints(){
	
}

public void pointsForRun(){
	individualScore+=runsScored*0.2;
	if(runsScored>=20){
		individualScore+=15;
	}
}

public void pointsForFielding(){
	individualScore+=catches*2;
	individualScore+=stumps*2;
	individualScore+=runOuts*2;
}
}
