package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

import output.BatFirstTemplate;
import output.ChaseTemplate;
import output.Template;
import output.TieTemplate;
import pojos.Batsman;
import pojos.Bowler;
import pojos.Match;
import pojos.Player;
import pojos.Team;
import pojos.TeamNames;

public class Main {

	static Map<String,Player> players = new HashMap<String,Player>();
	@SuppressWarnings("null")
	public static void main(String[] args) {
	
		Match m1 = new Match();
		
		Team t1 = new Team(TeamNames.INDIA.name(), 5);
	    Batsman b = new Batsman("Virat",TeamNames.INDIA.name(), 20,0,1,0);
	    addBatsman(b,t1);
	    //players.put("Virat", b);
	    //t1.addBatsMan(b);
	    Batsman b1 = new Batsman("Rahane",TeamNames.INDIA.name(), 25,0,0,0);
	    addBatsman(b1,t1);
	    //players.put("Rahane", b1);
	    //t1.addBatsMan(b1);

	    Bowler p1 = new Bowler("Bumrah", TeamNames.INDIA.name(), 0, 1, 0, 2, 2, 20, 2, false,0,0);
	    Bowler p2 = new Bowler("Shami",TeamNames.INDIA.name(), 5, 1, 0, 2,2, 6, 0, false,1,0);
	    Bowler p3 = new Bowler("Jadeja",TeamNames.INDIA.name(), 15, 0, 0, 1,2, 10, 2, true,0,0);
	    addBowler(p1,t1);
	    addBowler(p2,t1);
	    addBowler(p3,t1);
	    /*t1.addBowler(p1);
	    t1.addBowler(p2);
	    t1.addBowler(p3);
	    players.put("Bumrah", p1);
	    players.put("Shami", p2);
	    players.put("Jadeja", p3);*/
	    m1.setTeam1(t1);
	    Team t2 = new Team(TeamNames.AUSTRALIA.name(), 5);
	    Batsman t2b = new Batsman("Finch",TeamNames.AUSTRALIA.name(), 10,1,0,0);
	    addBatsman(t2b, t2);
	    //t2.addBatsMan(t2b);
	    Batsman t2b1 = new Batsman("Khwaja",TeamNames.AUSTRALIA.name(), 15,2,0,0);
	    addBatsman(t2b1, t2);
	    //t2.addBatsMan(t2b1);

	    Bowler t2p1 = new Bowler("Starc", TeamNames.AUSTRALIA.name(), 4, 1, 0, 2, 2, 20, 2, false,0,0);
	    Bowler t2p2 = new Bowler("Lyon",TeamNames.AUSTRALIA.name(), 5, 0, 0, 2,2, 25, 1, false,0,0);
	    Bowler t2p3 = new Bowler("Cummins",TeamNames.AUSTRALIA.name(), 2, 0, 0, 1,2, 20, 1, true,0,0);
	    addBowler(t2p1, t2);
	    addBowler(t2p2, t2);
	    addBowler(t2p3, t2);
	    /*t2.addBowler(t2p1);
	    t2.addBowler(t2p2);
	    t2.addBowler(t2p3);*/
	    
	    m1.setTeam2(t2);
	    printResultOfMatch(m1);
	    
	    //match 2
Match m2 = new Match();
		
		Team t3 = new Team(TeamNames.INDIA.name(), 5);
	    Batsman t3b = new Batsman("Virat",TeamNames.INDIA.name(), 10,0,1,0);
	    addBatsman(t3b, t3);
	    //t3.addBatsMan(t3b);
	    Batsman t3b1 = new Batsman("Rahul",TeamNames.INDIA.name(), 5,0,0,0);
	    addBatsman(t3b1, t3);
	    //t3.addBatsMan(t3b1);

	    Bowler t3p1 = new Bowler("Ishant", TeamNames.INDIA.name(), 0, 0, 1, 2, 2, 20, 1, false,0,0);
	    Bowler t3p2 = new Bowler("Shami",TeamNames.INDIA.name(), 8, 0, 0, 2,2, 9, 0, false,1,0);
	    Bowler t3p3 = new Bowler("Hardik",TeamNames.INDIA.name(), 15, 0, 0, 1,2, 10, 0, true,0,0);
	    addBowler(t3p1, t3);
	    addBowler(t3p2, t3);
	    addBowler(t3p3, t3);
	    /*t3.addBowler(t3p1);
	    t3.addBowler(t3p2);
	    t3.addBowler(t3p3);*/
	    m2.setTeam1(t3);
	    Team t4 = new Team(TeamNames.AUSTRALIA.name(), 5);
	    Batsman t4b = new Batsman("Warner",TeamNames.AUSTRALIA.name(), 22,1,0,0);
	    addBatsman(t4b, t4);
	    //t4.addBatsMan(t4b);
	    Batsman t4b1 = new Batsman("TimPane",TeamNames.AUSTRALIA.name(), 14,2,0,0);
	    addBatsman(t4b1, t4);
	    //t4.addBatsMan(t4b1);

	    Bowler t4p1 = new Bowler("Starc", TeamNames.AUSTRALIA.name(), 3, 0, 0, 2, 2, 10, 2, false,0,0);
	    Bowler t4p2 = new Bowler("Warne",TeamNames.AUSTRALIA.name(), 0, 1, 0, 2,2, 10, 1, false,0,0);
	    Bowler t4p3 = new Bowler("Marsh",TeamNames.AUSTRALIA.name(), 0, 0, 0, 1,2, 18, 1, true,0,0);
	    addBowler(t4p1, t4);
	    addBowler(t4p2, t4);
	    addBowler(t4p3, t4);
//	    t4.addBowler(t4p1);
//	    t4.addBowler(t4p2);
//	    t4.addBowler(t4p3);
	    
	    m2.setTeam2(t4);
	    
//run
	 //find winning team
	   printResultOfMatch(m2);
	   
	List<Match> matches = new ArrayList<>();
	matches.add(m1);
	matches.add(m2);
	printManOfTheSeries(matches);
	
	 
	    
	}

	private static void addBatsman(Batsman b, Team t) {
		if(players.get(b.getName())==null){
			players.put(b.getName(), b);
		}
		Batsman p = (Batsman) players.get(b.getName());
		p.setCatches(b.getCatches());
		p.setRunOuts(b.getRunOuts());
		p.setRunsScored(b.getRunsScored());
		p.setStumps(b.getStumps());
		   p.setIndividualScore(b.getIndividualScore());

		t.addBatsMan(p);
		
	}
	private static void addBowler(Bowler b, Team t) {
		if(players.get(b.getName())==null){
			players.put(b.getName(), b);
		}
		Bowler p = (Bowler) players.get(b.getName());
		p.setCatches(b.getCatches());
		p.setRunOuts(b.getRunOuts());
		p.setRunsScored(b.getRunsScored());
		p.setStumps(b.getStumps());
        p.setAllrounder(b.isAllrounder());
        p.setOversBowled(b.getOversBowled());
        p.setRunsConceded(b.getRunsConceded());
        p.setWicketsTaken(b.getWicketsTaken());
        p.setMaxOversToBeBowled(b.getMaxOversToBeBowled());
        p.setIndividualScore(b.getIndividualScore());
      
		t.addBowler(p);
		
	}

	private static void printManOfTheSeries(List<Match> matches) {
		EvaluatorUtil eval = new EvaluatorUtil();
		 Player manOftheSeries=eval.getManOfTheSeries(matches);
		 System.out.println("Man of the series: "+manOftheSeries.getName());
		
	}

	private static void printResultOfMatch(Match m1) {
		 EvaluatorUtil eval = new EvaluatorUtil();
		    Player manOfTheMatch,bestBatsman,bestBowler = null;
		    Template t ;
		    calculateScores(m1.getTeam1().getBatsmen());
		    calculateScores(m1.getTeam1().getBowlers());
		    
		    calculateScores(m1.getTeam2().getBatsmen());
		    calculateScores(m1.getTeam2().getBowlers());
		  
		    
		    
		    
		   int x1= m1.getTeam1().getBatsmen().stream().mapToInt(p->p.getRunsScored()).sum()+
				   m1.getTeam1().getBowlers().stream().mapToInt(p->p.getRunsScored()).sum();
		   int y1 = m1.getTeam2().getBatsmen().stream().mapToInt(p->p.getRunsScored()).sum()+
				   m1.getTeam2().getBowlers().stream().mapToInt(p->p.getRunsScored()).sum();

		   bestBowler= eval.getBestBowler(m1);
			 bestBatsman=eval.getBestBatsman(m1);
		 if(x1>y1){
			 manOfTheMatch =eval.findManOfTheMatch(m1.getTeam1());
			 manOfTheMatch.setIndividualScore(manOfTheMatch.getIndividualScore()+10);
			 m1.setManOfTheMatch(manOfTheMatch);
			 t=new BatFirstTemplate(m1.getTeam1().getTeamName(), bestBowler.getName(), bestBatsman.getName(), manOfTheMatch.getName(), x1-y1);
		 }
		 else if(y1>x1){
			 manOfTheMatch = eval.findManOfTheMatch(m1.getTeam2());
			 manOfTheMatch.setIndividualScore(manOfTheMatch.getIndividualScore()+10);
			 m1.setManOfTheMatch(manOfTheMatch);
			 int wicketsLeft = 5-m1.getTeam1().getBowlers().stream().mapToInt(a->a.getWicketsTaken()).sum();
			 t=new ChaseTemplate(m1.getTeam2().getTeamName(), bestBowler.getName(),bestBatsman.getName(),  manOfTheMatch.getName(),wicketsLeft);
		 }
		 else{
			  t= new TieTemplate(m1.getTeam1().getTeamName(), bestBowler.getName(),bestBatsman.getName(),null, m1.getTeam2().getTeamName());
		 }
		 
		System.out.println(t.printMsg());
		
	}

	private static void calculateScores(List<? extends Player> players) {
		 for(Player bt:players){
		    	bt.calculatePoints();
		    }
	}
	

}
