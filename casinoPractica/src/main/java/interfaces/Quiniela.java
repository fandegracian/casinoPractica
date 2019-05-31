package interfaces;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import jfdata.manager.JfdataManager;
import jfdata.model.match.Match;
import jfdata.model.match.MatchList;

public class Quiniela extends JPanel{
	private  JfdataManager jfdataManager;
	private Ventana ventana;
	
	public Quiniela(Ventana v) {
		super();
		ventana=v;
		jfdataManager= new JfdataManager("a24dd750af544df998c6eecad017c05f");
		MatchList actual = jfdataManager.getMatchesByCompetition(2015);
		List<Match> partidos=actual.getMatches();
		for(int i=0;i<partidos.size();i++) {
			System.out.println(partidos.get(i).getHomeTeam()+" "+partidos.get(i).getAwayTeam()+" "+partidos.get(i).getScore());
		}
	}
    
}
