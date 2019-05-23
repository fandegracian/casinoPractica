package interfaces;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Veintiuno extends JPanel{
	
	private Ventana ventana;
	private JTextField numeroJugador;
	private JTextField numeroBanca;
	
	public Veintiuno(Ventana v) {
		
		super();
		setBackground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(450,450);
		setLayout(null);
		
		
		JLabel lblBienvenidoAlVeintiuno = new JLabel("Bienvenido al veintiuno");
		lblBienvenidoAlVeintiuno.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 21));
		lblBienvenidoAlVeintiuno.setBounds(10, 26, 223, 42);
		add(lblBienvenidoAlVeintiuno);
		
		JLabel lblElObjetivoEs = new JLabel("El objetivo es acercarte lo m\u00E1ximo posible al n\u00FAmero 21 pero sin pasarte");
		lblElObjetivoEs.setBounds(10, 79, 351, 14);
		add(lblElObjetivoEs);
		
		JLabel lblSiLaBanca = new JLabel("Si la banca obtiene un n\u00FAmero superior al tuyo perder\u00E1s la partida");
		lblSiLaBanca.setBounds(10, 104, 331, 14);
		add(lblSiLaBanca);
		
		numeroJugador = new JTextField();
		numeroJugador.setBounds(96, 192, 86, 20);
		add(numeroJugador);
		numeroJugador.setColumns(10);
		
		JLabel lblTuNmero = new JLabel("Tu numero");
		lblTuNmero.setBounds(10, 195, 76, 14);
		add(lblTuNmero);
		
		numeroBanca = new JTextField();
		numeroBanca.setBounds(334, 192, 86, 20);
		add(numeroBanca);
		numeroBanca.setColumns(10);
		
		JLabel lblNmeroDeLa = new JLabel("Numero de la banca");
		lblNmeroDeLa.setBounds(209, 195, 132, 14);
		add(lblNmeroDeLa);
		
		final JLabel lblPerder = new JLabel("");
		lblPerder.setBounds(10, 343, 138, 14);
		add(lblPerder);
		
		JButton btnPedirCarta = new JButton("Pedir carta");
		btnPedirCarta.addMouseListener(new MouseAdapter() {
			int tuNumero = 0;
			@Override
			public void mouseClicked(MouseEvent e) {
				int carta = (int) (Math.random() * 11) + 1;
				tuNumero = tuNumero + carta;
				numeroJugador.setText(Integer.toString(tuNumero));
				if(tuNumero>21) {
					lblPerder.setText("Has perdido");
					numeroJugador.setText("Reinicia");
				}
			}
		});
		btnPedirCarta.setBounds(10, 278, 89, 23);
		add(btnPedirCarta);
		
		JButton btnPlantarse = new JButton("Plantarse");
		btnPlantarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnPlantarse.setBounds(114, 278, 89, 23);
		add(btnPlantarse);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irAlMenuJuegos();
			}
		});
		btnAtras.setBounds(331, 339, 89, 23);
		add(btnAtras);
	}
}

