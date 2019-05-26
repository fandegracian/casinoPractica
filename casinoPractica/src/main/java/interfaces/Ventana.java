package interfaces;

import javax.swing.JFrame;

import clases.Usuario;

public class Ventana extends JFrame{
	
	private EligeLoginRegistro elr;
	private Login login;
	private Registro registro;
	private Usuario usuario;
	private MenuJuegos menu;
	private Ruleta ruleta;
	private Veintiuno veintiuno;
	private Loteria loteria;

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
		this.setSize(450, 450);
		this.setContentPane(elr);
		this.setVisible(true);
	}
	
	public void irAlLogin() {
		if(login==null) {
			this.login = new Login(this);
		}
		this.setContentPane(login);
		this.login.setVisible(true);
	}
	
	public void irAlRegistro() {
		if(registro==null) {
			this.registro = new Registro(this);
		}
		this.setContentPane(registro);
		this.registro.setVisible(true);
	}
	
	public void irAlEligeLoginRegistro() {
		if(elr==null) {
			this.elr = new EligeLoginRegistro(this);
		}
		this.setContentPane(elr);
		this.elr.setVisible(true);
	}
	
	public void irAlMenuJuegos() {
		if(menu==null) {
			this.menu = new MenuJuegos(this);
		}
		this.setContentPane(menu);
		this.menu.setVisible(true);
	}
	
	public void irRuleta() {
		if(ruleta==null) {
			this.ruleta = new Ruleta(this);
		}
		this.setContentPane(ruleta);
		this.ruleta.setVisible(true);
	}
	
	public void irVeintiuno() {
		if(veintiuno==null) {
			this.veintiuno = new Veintiuno(this);
		}
		this.setContentPane(veintiuno);
		this.veintiuno.setVisible(true);
	}
	
	public void irLoteria() {
		if(loteria==null) {
			this.loteria = new Loteria(this);
		}
		this.setContentPane(loteria);
		this.loteria.setVisible(true);
	}
}
