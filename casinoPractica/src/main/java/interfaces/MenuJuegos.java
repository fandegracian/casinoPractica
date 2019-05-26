package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuJuegos extends JPanel{
	
	private Ventana ventana;
	
	public MenuJuegos (Ventana v) {
		super();
		setBackground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(450,450);
		setLayout(null);
		
		JButton btnRuleta = new JButton("Ruleta");
		btnRuleta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irRuleta();
			}
		});
		btnRuleta.setBounds(58, 121, 121, 49);
		add(btnRuleta);
		
		JButton btnNewButton = new JButton("21");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irVeintiuno();
			}
		});
		btnNewButton.setBounds(245, 121, 121, 49);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Loteria");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irLoteria();
			}
		});
		btnNewButton_1.setBounds(58, 261, 121, 49);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Quiniela");
		btnNewButton_2.setBounds(245, 261, 121, 49);
		add(btnNewButton_2);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlLogin();
			}
		});
		btnAtras.setBounds(277, 365, 89, 23);
		add(btnAtras);
		
		JLabel lblEligeEntreUno = new JLabel("Elige entre uno de nuestros cuatro juegos");
		lblEligeEntreUno.setForeground(Color.BLUE);
		lblEligeEntreUno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblEligeEntreUno.setBounds(10, 21, 430, 36);
		add(lblEligeEntreUno);
		
		this.setVisible(true);
	}
}
