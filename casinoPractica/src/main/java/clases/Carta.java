package clases;

public class Carta {
	
	private int valor;
	private String imagen;

	public Carta(int valor, String imagen) {
		this.valor = valor;
		this.imagen = imagen;
	}

	public int getValor() {
		return valor;
	}

	public String getImagen() {
		return imagen;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
}
