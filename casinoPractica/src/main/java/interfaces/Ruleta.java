package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ruleta extends JPanel{
	
	private Ventana ventana;
	private JTextField Dinero;
	private JTextField Numero;
	private JTextField Tipo;
	
	public Ruleta(Ventana v) {
		super();
		setBackground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(450,450);
		setLayout(null);
		
		JLabel lblBienvenidoALa = new JLabel("Bienvenido a la ruleta!");
		lblBienvenidoALa.setForeground(Color.WHITE);
		lblBienvenidoALa.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblBienvenidoALa.setBounds(10, 11, 194, 46);
		add(lblBienvenidoALa);
		
		JLabel lblParaJugarSolo = new JLabel("Para jugar solo tendras que elegir un n\u00FAmero (1-30) y un color (rojo-negro)");
		lblParaJugarSolo.setForeground(Color.WHITE);
		lblParaJugarSolo.setBounds(10, 68, 430, 14);
		add(lblParaJugarSolo);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setBounds(10, 223, 46, 14);
		add(lblNumero);
		
		Numero = new JTextField();
		Numero.setBounds(66, 220, 86, 20);
		add(Numero);
		Numero.setColumns(10);
		
		JLabel lblColor = new JLabel("Tipo");
		lblColor.setForeground(Color.WHITE);
		lblColor.setBounds(10, 279, 46, 14);
		add(lblColor);
		
		Tipo = new JTextField();
		Tipo.setBounds(66, 276, 86, 20);
		add(Tipo);
		Tipo.setColumns(10);
		
		JLabel lblNumeroganador = new JLabel("NumeroGanador");
		lblNumeroganador.setForeground(Color.WHITE);
		lblNumeroganador.setBounds(226, 223, 107, 14);
		add(lblNumeroganador);
		
		final JLabel lblnumGanador = new JLabel("");
		lblnumGanador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblnumGanador.setForeground(Color.WHITE);
		lblnumGanador.setBounds(344, 223, 46, 14);
		add(lblnumGanador);
		
		JLabel lblColorganador = new JLabel("ColorGanador");
		lblColorganador.setForeground(Color.WHITE);
		lblColorganador.setBounds(226, 279, 107, 14);
		add(lblColorganador);
		
		final JLabel lblColGanador = new JLabel("");
		lblColGanador.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblColGanador.setForeground(Color.WHITE);
		lblColGanador.setBackground(Color.WHITE);
		lblColGanador.setBounds(321, 279, 46, 14);
		add(lblColGanador);
		
		final JLabel Resultado = new JLabel("");
		Resultado.setForeground(Color.WHITE);
		Resultado.setFont(new Font("Tahoma", Font.BOLD, 15));
		Resultado.setBounds(10, 378, 257, 30);
		add(Resultado);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int numero = Integer.parseInt(Numero.getText());
				String color = Tipo.getText();
				int numeroGanador = (int) (Math.random() * 30) + 1;
				int numeroColor = (int) (Math.random() * 2) +1;
				String colorGanador;
				if(numeroColor==1) {
					colorGanador = "negro";
				}else {
					colorGanador = "rojo";
				}
				lblnumGanador.setText(Integer.toString(numeroGanador));
				lblColGanador.setText(colorGanador);
				boolean acierto1 = true;
				boolean acierto2 = false;
				if(numero==numeroGanador) {
					acierto1 = false;
				}else if(color.equals(colorGanador)){
					acierto2 = true;
				}
				
				if(acierto1 == false && acierto2 == true) {
					Resultado.setText("HAS GANADO!");
				}else {
					Resultado.setText("Casi, vuelve a intentarlo");
				}
			}
		});
		btnConfirmar.setBounds(63, 307, 89, 23);
		add(btnConfirmar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlMenuJuegos();
			}
		});
		btnAtras.setBounds(351, 374, 89, 23);
		add(btnAtras);
		
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.setContentPane(new Ruleta(ventana));
			}
		});
		btnReiniciar.setBounds(319, 307, 89, 23);
		add(btnReiniciar);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(0, 0, 450, 450);
		add(lblFoto);
		
		lblFoto.setIcon(new ImageIcon("./Imagenes/Ruleta.jpg"));
	}
}
