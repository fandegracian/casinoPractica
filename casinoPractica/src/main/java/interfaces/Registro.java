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

public class Registro extends JPanel{
	
	private Ventana ventana;
	private JTextField campoNombre;
	private JTextField campoUsuario;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField campoPass;
	private JTextField campoEdad;
	private JTextField campoDinero;
	private JButton btnAtras;
	private JButton btnRegistrarse;

	public Registro(Ventana v) {
		super();
		setBackground(new Color(0, 206, 209));
		setForeground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(300,300);
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 30, 46, 14);
		add(lblNombre);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 74, 46, 14);
		add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 181, 56, 14);
		add(lblContrasea);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 220, 46, 14);
		add(lblEdad);
		
		JLabel lblDinero = new JLabel("Dinero");
		lblDinero.setBounds(10, 2, 46, 14);
		add(lblDinero);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(103, 27, 86, 20);
		add(campoNombre);
		campoNombre.setColumns(10);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(103, 71, 86, 20);
		add(campoUsuario);
		campoUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 178, -72, 17);
		add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(183, 178, -72, 5);
		add(passwordField_1);
		
		campoPass = new JPasswordField();
		campoPass.setBounds(103, 178, 86, 20);
		add(campoPass);
		
		campoEdad = new JTextField();
		campoEdad.setBounds(103, 71, 86, 20);
		add(campoEdad);
		campoEdad.setColumns(10);
		
		campoDinero = new JTextField();
		campoDinero.setBounds(103, 71, 86, 20);
		add(campoDinero);
		campoDinero.setColumns(10);
		
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
			    String edad = campoEdad.getText();
			    String dinero = campoDinero.getText();
				
				ventana.setUsuario(new Usuario(nombre, contrasena,
						usuario, edad,dinero));
			}
		});
		btnRegistrarse.setBounds(100, 223, 89, 23);
		add(btnRegistrarse);
	}

}
