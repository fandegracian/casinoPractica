package interfaces;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import jfdata.manager.JfdataManager;
import jfdata.model.match.Match;
import jfdata.model.match.MatchList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Quiniela extends JPanel{
	private  JfdataManager jfdataManager;
	private Ventana ventana;
	
	public Quiniela(Ventana v) {
		super();
		setBackground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(450,450);
		setLayout(null);
		
		jfdataManager= new JfdataManager("a24dd750af544df998c6eecad017c05f");
		MatchList actual = jfdataManager.getMatchesByCompetition(2015);
		List<Match> partidos=actual.getMatches();
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(0, 0, 450, 450);
		add(lblFoto);
		lblFoto.setIcon(new ImageIcon("./Imagenes/Quiniela.jpg"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		for(int i=0;i<partidos.size();i++) {
			System.out.println(partidos.get(i).getHomeTeam()+" "+partidos.get(i).getAwayTeam()+" "+partidos.get(i).getScore());
		}*/
	}
    
}
