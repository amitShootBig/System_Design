package pojos;

import java.util.ArrayList;
import java.util.List;

public class Team {

	private String teamName;
	private int teamSize=5;
	private List<Player> players=  new ArrayList<>();
	private List<Bowler> bowlers= new ArrayList<>();
	List<Batsman> batsmen = new ArrayList<>();

	public Team(String teamName, int teamSize) {
		super();
		this.teamName = teamName;
		this.teamSize = teamSize;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}

  public void addBowler(Bowler b){
	   this.bowlers.add(b);
   }
  public  void addBatsMan(Batsman b){
	   this.batsmen.add(b);
   }
public List<Bowler> getBowlers() {
	return bowlers;
}
public void setBowlers(List<Bowler> bowlers) {
	this.bowlers = bowlers;
}
public List<Batsman> getBatsmen() {
	return batsmen;
}
public void setBatsmen(List<Batsman> batsmen) {
	this.batsmen = batsmen;
}
   
}
