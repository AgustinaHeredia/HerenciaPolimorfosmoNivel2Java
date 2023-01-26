package Smartphone;

public class Telefono {
	
	protected String marca;
	protected String modelo;
	
	public Telefono (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	public String llamar(String numTelefono) {
		return "Se está llamando al " + numTelefono;
	}
}
