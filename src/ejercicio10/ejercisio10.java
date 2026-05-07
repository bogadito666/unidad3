package ejercicio10;

import java.util.Scanner;


public class ejercisio10 {

	static Scanner entrada = new Scanner(System.in);
    static double presioUsuario = 0;
	public static void main(String[] args) {
		pedirDato();
	}
    	public static void pedirDato(){	
    		System.out.println("ingrese el nombre del vestido");
    		System.out.println("Nombre:");
    		String nombreUsuario = entrada.next();
    		System.out.println("ahora el presio del vestido");
    		System.out.println("presio:");
    		presioUsuario = entrada.nextDouble();
    		presioErroneo(presioUsuario);
    		imprimirEtiqueta(nombreUsuario, presioUsuario);
   }
    
    public static double presioErroneo( double presioUsuario) {
  
    	while(presioUsuario <=0){ 
    		System.err.println("quiere regalarlo o que,intentelo de nuevo");
    		presioUsuario = entrada.nextDouble();
    	}
		return presioUsuario;
	}	                                                                                                                                                                                                                 
    	
    	public static void imprimirEtiqueta(String nombreUsuario, double presioUsuario) {
    		
    		System.out.println("Nombre :" + nombreUsuario);
    		System.out.println("presio :" + presioUsuario);
    	}
    	
}
