package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
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
		btnLogin.setBounds(10, 322, 155, 60);
		add(btnLogin);
		
		BotonMenu btnRegister = new BotonMenu("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlRegistro();
			}
		});
		btnRegister.setBounds(268, 322, 155, 60);
		add(btnRegister);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setForeground(Color.RED);
		lblBienvenido.setFont(new Font("Dialog", Font.BOLD, 40));
		lblBienvenido.setBounds(10, 11, 280, 46);
		add(lblBienvenido);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(0, 0, 450, 450);
		add(lblFoto);
		
		lblFoto.setIcon(new ImageIcon("./Imagenes/casinoInterior.jpg"));
		
		this.setVisible(true);
	}
}