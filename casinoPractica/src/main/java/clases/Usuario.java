package clases;

public class Usuario {
	
	private String nombre;
	private String usuario;
	private String contraseña;
	private String edad;
	private String dinero;

	public Usuario(String nombre, String usuario, String contraseña, String edad) {
		this.nombre = nombre;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public String getEdad() {
		return edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public void setEdad(String edad) {
		this.edad = edad;
	}
}
