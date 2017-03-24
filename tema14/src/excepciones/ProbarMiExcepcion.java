package excepciones;

import java.util.Scanner;

public class ProbarMiExcepcion {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.print("Teclea un nomobre: ");
		String nombre = teclado.nextLine();
		if(nombre.toUpperCase().equals("PEPE")){
			try {				
				throw new ExcepcionPepe();
			} catch (ExcepcionPepe e) {				
				e.printStackTrace();
			}
		}else
			System.out.println("El nombre es "+nombre);	

	}

}
