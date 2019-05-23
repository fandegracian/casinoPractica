package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import clases.Usuario;
import jfdata.manager.JfdataManager;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login extends JPanel{
	private JTextField userField;
	private JPasswordField passwordField;
	private Ventana ventana;

	public Login(Ventana v) {
		super();
		this.ventana = v;
		setSize(450,450);
		setBackground(new Color(0, 206, 209));
		setLayout(null);
		
		JLabel lblUsername = new JLabel("User");
		lblUsername.setBounds(10, 69, 49, 14);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 124, 46, 14);
		add(lblPassword);
		
		userField = new JTextField();
		userField.setBounds(79, 66, 86, 20);
		add(userField);
		userField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(79, 121, 86, 20);
		add(passwordField);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JLabel lblAviso = new JLabel("");
				lblAviso.setBounds(10, 166, 280, 14);
				add(lblAviso);
				Connection con;
				String usuario = userField.getText();
		        String contrasena = String.copyValueOf(((JPasswordField) passwordField).getPassword());
				try {
					con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/casinovirtual?useUnicode=true"
							+ "&useJDBCCompliantTimezoneShift=true"
							+ "&useLegacyDatetimeCode=false&serverTimezone=UTC", "casinovirtual", "casinovirtual");
					Statement smt=con.createStatement();
					String SQL = "SELECT * FROM registro WHERE usuario='" + usuario + "' && contraseña='" + contrasena + "'";
                    ResultSet rs = smt.executeQuery(SQL);
                    if (rs.next()) {
                        ventana.setUsuario(new Usuario(rs.getString("nombre"),rs.getString("usuario"),rs.getString("contraseña"),rs.getString("edad")));
                        JfdataManager jfdataManager = new JfdataManager("a24dd750af544df998c6eecad017c05f");
                        ventana.irAlMenuJuegos();
                    }else { 
                    	lblAviso.setText("<html>Los datos introducidos son incorrectos</html>");
                    }
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnConfirmar.setBounds(79, 206, 89, 23);
		add(btnConfirmar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlEligeLoginRegistro();
			}
		});
		btnAtras.setBounds(188, 206, 89, 23);
		add(btnAtras);
		
		this.setVisible(true);
	}
}