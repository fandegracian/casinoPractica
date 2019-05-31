package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import interfaces.Ventana;
import jfdata.manager.JfdataManager;
import jfdata.model.match.Match;
import jfdata.model.match.MatchList;

public class Main {

	public static void main(String[] args) {
		
		Ventana principal = new Ventana();
		JfdataManager jfdataManager= new JfdataManager("a24dd750af544df998c6eecad017c05f");
		MatchList actual = jfdataManager.getMatchesByCompetition(2021);
		List<Match> partidos=actual.getMatches();
		for(int i=0;i<partidos.size();i++) {
			System.out.println(partidos.get(i).getHomeTeam().getName()+" vs "+partidos.get(i).getAwayTeam().getName()+" : "+partidos.get(i).getScore().getFullTime().getHomeTeam()+" - "+partidos.get(i).getScore().getFullTime().getAwayTeam());
		}
	}
}
