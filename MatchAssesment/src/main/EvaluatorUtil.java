package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pojos.Batsman;
import pojos.Bowler;
import pojos.Match;
import pojos.Player;
import pojos.Team;

public class EvaluatorUtil {
	Comparator<? super Player> scoreComparator = (p1, p2) -> p1.getIndividualScore() - p2.getIndividualScore();
	//Comparator<Batsman> scoreComparator2 = (p1, p2) -> p1.getIndividualScore() - p2.getIndividualScore();
	Comparator<Bowler> wicketComparator = (p1, p2) -> p1.getWicketsTaken() - p2.getWicketsTaken();
	Comparator<Player> runComparator = (p1, p2) -> p1.getRunsScored() - p2.getRunsScored();
	
	Player findManOfTheMatch(Team t){
		Optional<Batsman> manOfTheMatch=null;
		Optional<Batsman> x1=null;
		Optional<Batsman> y1=null;
		List<Batsman> batsman = t.getBatsmen();
		List<Bowler> bowlers= t.getBowlers();
		if(batsman!=null){
       x1 =  batsman.stream().collect(Collectors.maxBy(scoreComparator));
		}
		y1=bowlers.stream().collect(Collectors.maxBy(scoreComparator));
		manOfTheMatch = x1.get().getIndividualScore()>y1.get().getIndividualScore()?x1:y1;
		return (manOfTheMatch!=null && manOfTheMatch.isPresent())?manOfTheMatch.get():null;
	}
	
	Player getBestBowler(Match m){
		List<Bowler> bowlers = new ArrayList<>();
		bowlers.addAll(m.getTeam1().getBowlers());
		bowlers.addAll(m.getTeam2().getBowlers());
		bowlers.sort(wicketComparator);
		int n= bowlers.size();
		if(bowlers.size()>2){
			int x = bowlers.get(n-1).getWicketsTaken();
			int y = bowlers.get(n-2).getWicketsTaken();
			if(x==y){
				return bowlers.get(n-1).getRunsConceded()<bowlers.get(n-2).getRunsConceded()?bowlers.get(n-1):bowlers.get(n-2);
			}
		}
		return bowlers.get(n-1);	
		
	}
	
  Player getBestBatsman(Match m){
	  List<Player> batsmen = new ArrayList<Player>();
	  batsmen.addAll(m.getTeam1().getBatsmen());
	  batsmen.addAll(m.getTeam2().getBatsmen());
	  int n = batsmen.size();
	  batsmen.sort(runComparator);
	  return batsmen.get(n-1);
	}
  
 Player getManOfTheSeries(List<Match> matches){
	 List<Player> players = new ArrayList<>();
	 for(Match m:matches){
		 players.addAll(m.getTeam1().getBatsmen());
		 players.addAll(m.getTeam1().getBowlers());
	 }
	 players.sort(scoreComparator);
	 if(players.size()>=1){
		 return players.get(players.size()-1);
	 }
	 return null;
	 
 }
	
	
}
