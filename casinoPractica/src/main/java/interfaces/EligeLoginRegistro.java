package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import componentes.BotonMenu;
import java.awt.Cursor;

public class EligeLoginRegistro extends JPanel {
	
	private Ventana ventana;

	public EligeLoginRegistro(Ventana v) {
		super();
		this.ventana = v;
		setSize(new Dimension(450, 450));
		setBackground(new Color(0, 206, 209));
		setLayout(null);
		
		BotonMenu btnLogin = new BotonMenu("Login");
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlLogin();
			}
		});
		btnLogin.setBounds(72, 108, 155, 60);
		add(btnLogin);
		
		BotonMenu btnRegister = new BotonMenu("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlRegistro();
			}
		});
		btnRegister.setBounds(72, 190, 155, 60);
		add(btnRegister);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setForeground(new Color(128, 0, 128));
		lblBienvenido.setFont(new Font("Algerian", Font.PLAIN, 23));
		lblBienvenido.setBounds(10, 11, 280, 23);
		add(lblBienvenido);
		
		JLabel lblNewLabel = new JLabel("Registrate o inicia sesión si aun no tienes cuenta");
		lblNewLabel.setBounds(10, 46, 280, 14);
		add(lblNewLabel);
		
		this.setVisible(true);
	}
}