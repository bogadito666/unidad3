package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {

		mostrarEnPantalla(  obtenerFraccionario( ingresarNumero() )   );
		
	}

	private static void mostrarEnPantalla( double numFracc  ) {
		
		System.out.println("El numero fraccionario es: " + numFracc);
		
	}

	private static double obtenerFraccionario( double numIngr ) {
	
		double numFraccionario ;
		int numEntero = (int) numIngr;
	
		numFraccionario = numIngr - (double) numEntero;
		
		return numFraccionario;
	}

	private static double ingresarNumero() {
		System.out.println("Ingrese un número");
		
		double numeroIgresado = entrada.nextDouble();
		
		return numeroIgresado;
	}
	
	
}
