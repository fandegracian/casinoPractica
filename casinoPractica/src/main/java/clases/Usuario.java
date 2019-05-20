package clases;

public class Usuario {
	
	private String nombre;
	private String usuario;
	private String contraseña;
	private String edad;
	private String dinero;

	public Usuario(String nombre, String usuario, String contraseña, String edad, String dinero) {
		this.nombre = nombre;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.edad = edad;
		this.dinero = dinero;
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

	public String getDinero() {
		return dinero;
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

	public void setDinero(String dinero) {
		this.dinero = dinero;
	}
}
