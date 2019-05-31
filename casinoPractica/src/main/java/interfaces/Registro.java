package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

import clases.Usuario;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
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
	private JButton btnAtras;
	private JButton btnRegistrarse;
	private JTextField campoEdad;
	private JLabel lblFoto;

	public Registro(Ventana v) {
		super();
		setBackground(new Color(0, 206, 209));
		setForeground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(450,450);
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(40, 75, 46, 14);
		add(lblNombre);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(40, 140, 46, 14);
		add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(40, 202, 71, 14);
		add(lblContrasea);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(40, 269, 46, 14);
		add(lblEdad);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(103, 72, 86, 20);
		add(campoNombre);
		campoNombre.setColumns(10);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(103, 137, 86, 20);
		add(campoUsuario);
		campoUsuario.setColumns(10);
		
		campoPass = new JPasswordField();
		campoPass.setBounds(121, 199, 86, 20);
		add(campoPass);
		
		btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.irAlEligeLoginRegistro();
			}
		});
		btnAtras.setBounds(199, 362, 89, 23);
		add(btnAtras);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int edad = 0;
				String nombre = campoNombre.getText();
				String contrasena = String.copyValueOf(campoPass.getPassword());
				String usuario = campoUsuario.getText();
			    String edadCampo = campoEdad.getText();
			    edad = Integer.parseInt(edadCampo);
			    
			    Connection con;
			    
				try {
					con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/casinovirtual?useUnicode=true"
							+ "&useJDBCCompliantTimezoneShift=true"
							+ "&useLegacyDatetimeCode=false&serverTimezone=UTC", "casinovirtual", "casinovirtual");
					Statement smt=con.createStatement();
					String SQL = "INSERT INTO registro values('"+nombre+"','"+usuario+"','"+contrasena+"',"+edad+");";
                    smt.executeUpdate(SQL);
                    ventana.irAlEligeLoginRegistro();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				ventana.setUsuario(new Usuario(nombre, contrasena,
						usuario, edad));	
			}
		});
		btnRegistrarse.setBounds(100, 362, 89, 23);
		add(btnRegistrarse);
		
		campoEdad = new JTextField();
		campoEdad.setBounds(103, 266, 86, 20);
		add(campoEdad);
		campoEdad.setColumns(10);
		
		lblFoto = new JLabel("");
		lblFoto.setBounds(0, 0, 450, 450);
		add(lblFoto);
		
		lblFoto.setIcon(new ImageIcon("./Imagenes/Registro.png"));
	}
}
