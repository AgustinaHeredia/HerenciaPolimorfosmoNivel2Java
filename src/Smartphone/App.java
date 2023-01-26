package Smartphone;

import java.util.Scanner;

public class App {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		Smartphone movil = new Smartphone("Samsung","Galaxie");
		
		int seleccion=0;
		do {
			seleccion=pedirInt(" Escribe qué deseas realizar con tu Smartphone: 1- llamar 2- Tomar fotografía 3- Alarma 0- Salir");
			switch (seleccion){ 
			case 1:
				System.out.println(movil.llamar(pedirString("Marca el número al que deseas llamar")));
				break;
			case 2:
				System.out.println(movil.fotografiar());
				break;
			case 3:
				System.out.println(movil.alarma());
				break;
			case 0:
				System.out.println("Has elegido salir. Hasta pronto.");
				break;
			default:
				System.out.println("El número ingresado no es una acción correcta");
			}
		}while (seleccion !=0);
		
		
	}
	static int pedirInt(String texto) {
		System.out.println(texto);
		int n1 = input.nextInt();
		return n1;
	}
	static String pedirString(String texto) {
		System.out.println(texto);
		String nom = input.next();
		return nom;
	}
	
}
