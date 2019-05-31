package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import clases.Usuario;
import excepciones.ExcepcionLogin;
import jfdata.manager.JfdataManager;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Font;

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
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsername.setForeground(Color.RED);
		lblUsername.setBounds(50, 46, 49, 14);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setForeground(Color.RED);
		lblPassword.setBounds(50, 81, 62, 14);
		add(lblPassword);
		
		userField = new JTextField();
		userField.setBounds(157, 43, 86, 20);
		add(userField);
		userField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 78, 86, 20);
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
					String SQL = "SELECT * FROM registro WHERE usuario='" + usuario + "' && contrasena='" + contrasena + "'";
                    ResultSet rs = smt.executeQuery(SQL);
                    if (rs.next()) {
                       ventana.setUsuario(new Usuario(rs.getString("nombre"),rs.getString("usuario"),rs.getString("contrasena"),rs.getInt("edad")));
                       ventana.irAlMenuJuegos();
                    }else { 
                    	throw new ExcepcionLogin("Los datos no son correctos");
                    }
					con.close();
				} catch (SQLException e1) {
				} catch (ExcepcionLogin e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(ventana, "Los datos no son correctos");
				}
			}
		});
		btnConfirmar.setBounds(10, 356, 89, 23);
		add(btnConfirmar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlEligeLoginRegistro();
			}
		});
		btnAtras.setBounds(333, 356, 89, 23);
		add(btnAtras);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(0, 0, 450, 450);
		add(lblFoto);
		
		lblFoto.setIcon(new ImageIcon("./Imagenes/Login.png"));
		
		this.setVisible(true);
	}
}