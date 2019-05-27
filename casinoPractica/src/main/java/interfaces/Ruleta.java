package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ruleta extends JPanel{
	
	private Ventana ventana;
	private JTextField Dinero;
	private JTextField Numero;
	private JTextField Color;
	private JTextField NumeroGanador;
	private JTextField ColorGanador;
	
	public Ruleta(Ventana v) {
		super();
		setBackground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(450,450);
		setLayout(null);
		
		JLabel lblBienvenidoALa = new JLabel("Bienvenido a la ruleta!");
		lblBienvenidoALa.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 18));
		lblBienvenidoALa.setBounds(10, 11, 194, 46);
		add(lblBienvenidoALa);
		
		JLabel lblParaJugarSolo = new JLabel("Para jugar solo tendras que elegir un n\u00FAmero (1-30) y un color (rojo-negro)");
		lblParaJugarSolo.setBounds(10, 68, 430, 14);
		add(lblParaJugarSolo);
		
		JLabel lblIntroduceTuDinero = new JLabel("Introduce tu dinero por favor");
		lblIntroduceTuDinero.setBounds(10, 93, 150, 14);
		add(lblIntroduceTuDinero);
		
		Dinero = new JTextField();
		Dinero.setBounds(167, 93, 86, 20);
		add(Dinero);
		Dinero.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(10, 223, 46, 14);
		add(lblNumero);
		
		Numero = new JTextField();
		Numero.setBounds(66, 220, 86, 20);
		add(Numero);
		Numero.setColumns(10);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(10, 279, 46, 14);
		add(lblColor);
		
		Color = new JTextField();
		Color.setBounds(66, 276, 86, 20);
		add(Color);
		Color.setColumns(10);
		
		JLabel lblNumeroganador = new JLabel("NumeroGanador");
		lblNumeroganador.setBounds(226, 223, 86, 14);
		add(lblNumeroganador);
		
		NumeroGanador = new JTextField();
		NumeroGanador.setBounds(322, 220, 86, 20);
		add(NumeroGanador);
		NumeroGanador.setColumns(10);
		
		JLabel lblColorganador = new JLabel("ColorGanador");
		lblColorganador.setBounds(226, 279, 86, 14);
		add(lblColorganador);
		
		ColorGanador = new JTextField();
		ColorGanador.setBounds(322, 276, 86, 20);
		add(ColorGanador);
		ColorGanador.setColumns(10);
		
		final JLabel Resultado = new JLabel("");
		Resultado.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		Resultado.setBounds(66, 378, 187, 30);
		add(Resultado);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int dinero = Integer.parseInt(Dinero.getText());
				int numero = Integer.parseInt(Numero.getText());
				String color = Color.getText();
				int numeroGanador = (int) (Math.random() * 30) + 1;
				int numeroColor = (int) (Math.random() * 2) +1;
				String colorGanador;
				if(numeroColor==1) {
					colorGanador = "negro";
				}else {
					colorGanador = "rojo";
				}
				NumeroGanador.setText(Integer.toString(numeroGanador));
				ColorGanador.setText(colorGanador);
				boolean acierto1 = true;
				boolean acierto2 = false;
				if(numero==numeroGanador) {
					acierto1 = false;
				}else if(color.equals(colorGanador)){
					acierto2 = true;
				}
				
				if(acierto1 == false && acierto2 == true) {
					dinero = dinero * 5;
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
				ventana.setContentPane(new Veintiuno(ventana));
			}
		});
		btnReiniciar.setBounds(319, 307, 89, 23);
		add(btnReiniciar);
	}
}
