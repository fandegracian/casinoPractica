package clases;

public class Usuario {
	
	private String nombre;
	private String usuario;
	private String contrasena;
	private int edad;
	
	public Usuario(String nombre, String usuario, String contrasena, int edad) {
		this.nombre = nombre;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
