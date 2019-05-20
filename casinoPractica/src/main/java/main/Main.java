package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import interfaces.Ventana;
import jfdata.manager.JfdataManager;
import jfdata.model.match.Match;
import jfdata.model.match.MatchList;

public class Main {

	public static void main(String[] args) {
		
		Ventana principal = new Ventana();
		
		JfdataManager jfdataManager = new JfdataManager("a24dd750af544df998c6eecad017c05f");
		MatchList actual = jfdataManager.getMatchesByCompetition(2015);
		System.out.println(jfdataManager.getMatch(566));
		
		
		Connection con;
		try {
			con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/casinovirtual?useUnicode=true"
					+ "&useJDBCCompliantTimezoneShift=true"
					+ "&useLegacyDatetimeCode=false&serverTimezone=UTC", "casinovirtual", "casinovirtual");
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from registro");
			System.out.println(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
