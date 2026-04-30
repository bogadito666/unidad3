package unidad2;

import java.util.Scanner;

public class ejercisio9 {
	static Scanner entrada = new Scanner(System.in);
	static int EntradaPuntaje = 0;
	static int opcion = 0;
	static int puntaje = 0;
	static int puntajeMaximo = 0;

	public static void main(String[] args) {

		ejecutarMenu();
		
	}

	public static void registrarPuntajes() {
		System.out.println("ingrece su puntaje :");
		EntradaPuntaje = entrada.nextInt();
	}

	public static void mostrarMejorPuntaje() {
		if (EntradaPuntaje > puntajeMaximo) {
			puntajeMaximo = EntradaPuntaje;
			System.out.println("el puntaje mas alto :" + puntajeMaximo);
		}

	}

	public static void validarIngreso() {
		while (EntradaPuntaje > 500 || EntradaPuntaje < 0) {
			System.err.println("Opcion incorrecta.");
			EntradaPuntaje = entrada.nextInt();
		}
	}

	public static void ingresandoSalida() {
		System.out.println("a finalisado adios ");
	}

	public static void ejecutarMenu() {
		do {
			System.out.println("==============================");
			System.out.println("ingrese el numero");
			System.out.println("1_Registrar puntaje 📥");
			System.out.println("2_Mostrar mejor puntaje 👑");
			System.out.println("3_Salir 🚪");
			System.out.println("==============================");
			opcion = entrada.nextInt();

			if (opcion == 1) {
				registrarPuntajes();
				validarIngreso();
			} else if (opcion == 2) {
				mostrarMejorPuntaje();
			} else if (opcion == 3) {
				ingresandoSalida();

			}

		} while (opcion != 3);
	}

}