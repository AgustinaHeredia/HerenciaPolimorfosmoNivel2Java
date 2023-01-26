package Smartphone;

public class Smartphone extends Telefono implements Camara, Reloj{

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		
	}
	
	public String fotografiar() {
		return "Se está haciendo una fotografía";
	}
	public String alarma() {
		return "Está sonando la alarma";
	}
}
