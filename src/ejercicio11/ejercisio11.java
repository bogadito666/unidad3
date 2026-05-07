package ejercicio11;

import java.util.Scanner;

public class ejercisio11 {
	
	static Scanner entrada = new Scanner(System.in);
	
	static double saldoUsuario =0;
	
	static public void menu() {
		System.out.println("1_Ver saldo actual");
		System.out.println("2_Depositar dinero");
		System.out.println("3_Retirar dinero ");
		System.out.println("4_salir");
		int datoUsuario = entrada.nextInt(); 
		
		switch (datoUsuario) {
		case 1:
				verSaldo();
				 menu();
		break;
		
		case 2	:
				depositarDinero();
				menu();
		break;
		
		case 3:
			retirarDinero();
			menu();
		break;
		
		case 4:
			System.out.println("buelva pronto");
			
		break;
		
		default:
			break;
		}
	}
	
	
	
	private static void verSaldo() {
		System.out.println("tu saldo es de :"+ saldoUsuario);
	}



	private static void depositarDinero() {
		System.out.println("cuanto dinero quiere depositar:");
		double depositarDinero = entrada.nextDouble();
		
		while (depositarDinero < 0) {
			System.err.println("su deposito esta mal hagalo de nuevo");
			depositarDinero = entrada.nextDouble();	
			}
		
		saldoUsuario = saldoUsuario + depositarDinero;
		
	}



	private static void retirarDinero() {
		System.out.println("cuanto dinero quiere retirar:");
		double retirarDinero = entrada.nextDouble();
		
		saldoUsuario = saldoUsuario - retirarDinero;
		
		while (retirarDinero < 0 || retirarDinero > saldoUsuario) {
		System.err.println("tu saldo no coincide intentelo de nuevo ");
		double depositarDinero = entrada.nextDouble();	
			}
	}



	public static void main(String[] args) {
		
		menu();
	}

}
