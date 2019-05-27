package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Array;
import java.util.Arrays;

public class Loteria extends JPanel{
	
	private Ventana ventana;
	private JTextField tuNumero;
	private JTextField cmbGanadora;
	private JTextField serie;
	private JTextField fraccion;
	
	public Loteria(Ventana v) {
		
		super();
		setBackground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(450,450);
		setLayout(null);
		
		JLabel lblBienvenidoALa = new JLabel("Bienvenido a la Loteria");
		lblBienvenidoALa.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBienvenidoALa.setBounds(10, 23, 247, 29);
		add(lblBienvenidoALa);
		
		JLabel lblDependiendoDeLa = new JLabel("Dependiendo de la cantidad de numeros acertados recibiras una compensaci\u00F3n economica");
		lblDependiendoDeLa.setBounds(10, 63, 430, 14);
		add(lblDependiendoDeLa);
		
		JLabel lblTuNumero = new JLabel("Tu numero");
		lblTuNumero.setBounds(10, 102, 58, 14);
		add(lblTuNumero);
		
		tuNumero = new JTextField();
		tuNumero.setBounds(67, 99, 86, 20);
		add(tuNumero);
		tuNumero.setColumns(10);
		
		JLabel lblSerie = new JLabel("Serie");
		lblSerie.setBounds(10, 251, 46, 14);
		add(lblSerie);
		
		serie = new JTextField();
		serie.setBounds(48, 248, 86, 20);
		add(serie);
		serie.setColumns(10);
		
		JLabel lblFraccin = new JLabel("Fracci\u00F3n");
		lblFraccin.setBounds(10, 300, 46, 14);
		add(lblFraccin);
		
		fraccion = new JTextField();
		fraccion.setBounds(67, 297, 86, 20);
		add(fraccion);
		fraccion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 366, 430, 73);
		add(lblNewLabel);
		
		JLabel lblCombinacinGanadora = new JLabel("Combinaci\u00F3n ganadora");
		lblCombinacinGanadora.setBounds(10, 195, 109, 14);
		add(lblCombinacinGanadora);
		
		cmbGanadora = new JTextField();
		cmbGanadora.setBounds(129, 192, 86, 20);
		add(cmbGanadora);
		cmbGanadora.setColumns(10);
		
		
		JButton btnIntroducir = new JButton("Introducir");
		btnIntroducir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int tuCombinacion = Integer.parseInt(tuNumero.getText());
				int[] numeroGanador;
				numeroGanador = new int[5];
				for(int i = 0; i<numeroGanador.length; i++) {
					numeroGanador[i] = (int) (Math.random()*9);
				}
				cmbGanadora.setText(Arrays.toString(numeroGanador));
				int numSerie = (int) (Math.random()*99);
				int numFraccion = (int) (Math.random()*10);
				serie.setText(Integer.toString(numSerie));
				fraccion.setText(Integer.toString(numFraccion));
				
			}
		});
		btnIntroducir.setBounds(10, 127, 89, 23);
		add(btnIntroducir);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlMenuJuegos();
			}
		});
		btnAtras.setBounds(311, 296, 89, 23);
		add(btnAtras);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.setContentPane(new Veintiuno(ventana));
			}
		});
		btnReiniciar.setBounds(212, 296, 89, 23);
		add(btnReiniciar);
	}
}
