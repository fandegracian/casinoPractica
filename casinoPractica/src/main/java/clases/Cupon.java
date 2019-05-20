package clases;

public class Cupon {
	
	private int[] combinacion;
	private int serie;
	private int fraccion;
	private int precio;

	public Cupon(int[] combinacion, int serie, int fraccion, int precio) {
		this.combinacion = combinacion;
		this.serie = serie;
		this.fraccion = fraccion;
		this.precio = precio;
	}

	public int[] getCombinacion() {
		return combinacion;
	}

	public int getSerie() {
		return serie;
	}

	public int getFraccion() {
		return fraccion;
	}

	public int getPrecio() {
		return precio;
	}
	
	public void setCombinacion(int[] combinacion) {
		this.combinacion = combinacion;
	}
	
	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	public void setFraccion(int fraccion) {
		this.fraccion = fraccion;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
