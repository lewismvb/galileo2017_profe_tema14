package excepciones;

import java.util.Scanner;

public class ProbarExcepciones {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		// VALIDACION DE ENTRRADA
		// BLOQUE 1
		teclado = new Scanner(System.in);	
		
		int[] numeros = new int[10];
		boolean error;
		int iNumero = 0;
		int doble = 0;
		do {
			error = false;
			System.out.print("Teclea un numero: ");
			try { // BLOQUE 2
				String sNumero = teclado.nextLine();
				numeros[10] = Integer.parseInt(sNumero);
				doble = 2 * iNumero;
			} catch (NumberFormatException e) {
				// BLOQUE 3
				System.out.println("Error, no ha tecleado un  numero");
				//System.out.println(e.toString());
				// e.printStackTrace();
				error = true;				
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Error en el indice del array");
				error = true;
			} catch (Exception e) {				
				System.out.println(e.toString());
				// e.printStackTrace();
				error = true;
			}
		} while (error == true);
		// BLOQUE 4
		System.out.println("El doble de " + iNumero + " es " + doble);
	}
}
