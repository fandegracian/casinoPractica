package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import clases.Usuario;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Registro extends JPanel{
	
	private Ventana ventana;
	private JTextField campoNombre;
	private JTextField campoUsuario;
	private JPasswordField campoPass;
	private JTextField campoEdad;
	private JButton btnAtras;
	private JButton btnRegistrarse;
	private JTextField textField;

	public Registro(Ventana v) {
		super();
		setBackground(new Color(0, 206, 209));
		setForeground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(450,450);
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 30, 46, 14);
		add(lblNombre);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 74, 46, 14);
		add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 119, 56, 14);
		add(lblContrasea);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 169, 46, 14);
		add(lblEdad);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(103, 27, 86, 20);
		add(campoNombre);
		campoNombre.setColumns(10);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(103, 71, 86, 20);
		add(campoUsuario);
		campoUsuario.setColumns(10);
		
		campoPass = new JPasswordField();
		campoPass.setBounds(103, 116, 86, 20);
		add(campoPass);
		
		campoEdad = new JTextField();
		campoEdad.setBounds(103, 71, 86, 20);
		add(campoEdad);
		
		btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlEligeLoginRegistro();
			}
		});
		btnAtras.setBounds(201, 223, 89, 23);
		add(btnAtras);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre = campoNombre.getText();
				String contrasena = String.copyValueOf(campoPass.getPassword());
				String usuario = campoUsuario.getText();
			    int edad = Integer.parseInt(campoEdad.getText());
			    
			    Connection con;
			    
				try {
					con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/casinovirtual?useUnicode=true"
							+ "&useJDBCCompliantTimezoneShift=true"
							+ "&useLegacyDatetimeCode=false&serverTimezone=UTC", "casinovirtual", "casinovirtual");
					Statement smt=con.createStatement();
					String SQL = "INSERT INTO registro values('"+nombre+"','"+usuario+"','"+contrasena+"','"+edad+"');";
					System.out.println(edad);
                    smt.executeUpdate(SQL);
                    ventana.irAlEligeLoginRegistro();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				ventana.setUsuario(new Usuario(nombre, contrasena,
						usuario, edad));	
			}
		});
		btnRegistrarse.setBounds(100, 223, 89, 23);
		add(btnRegistrarse);
		
		textField = new JTextField();
		textField.setBounds(103, 166, 86, 20);
		add(textField);
		textField.setColumns(10);
	}
}
