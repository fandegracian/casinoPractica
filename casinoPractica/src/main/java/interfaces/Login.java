package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JPanel{
	private JTextField textField;
	private JPasswordField passwordField;
	private Ventana ventana;

	public Login(Ventana v) {
		super();
		this.ventana = v;
		setSize(300,300);
		setBackground(new Color(0, 206, 209));
		setLayout(null);
		
		JLabel lblUsername = new JLabel("User");
		lblUsername.setBounds(42, 69, 49, 14);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(42, 124, 46, 14);
		add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(115, 66, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(115, 121, 86, 20);
		add(passwordField);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(112, 206, 89, 23);
		add(btnConfirmar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlEligeLoginRegistro();
			}
		});
		btnAtras.setBounds(201, 266, 89, 23);
		add(btnAtras);
		
		this.setVisible(true);
	}
}