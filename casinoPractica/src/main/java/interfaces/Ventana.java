package interfaces;

import javax.swing.JFrame;

import clases.Usuario;

public class Ventana extends JFrame{
	
	private EligeLoginRegistro elr;
	private Login login;
	private Registro registro;
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Ventana() {
		super();
		elr = new EligeLoginRegistro(this);
		this.setTitle("Inicio de sesion");
		this.setSize(300, 300);
		this.setContentPane(elr);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void irAlLogin() {
		if(login==null) {
			this.login = new Login(this);
		}
		elr.setVisible(false);
		this.setContentPane(login);
		this.login.setVisible(true);
	}
	
	public void irAlRegistro() {
		if(registro==null) {
			this.registro = new Registro(this);
		}
		elr.setVisible(false);
		this.setContentPane(registro);
		this.registro.setVisible(true);
	}
	
	public void irAlEligeLoginRegistro() {
		if(elr==null) {
			this.elr = new EligeLoginRegistro(this);
		}
		login.setVisible(false);
		this.setContentPane(elr);
		this.elr.setVisible(true);
	}

}
