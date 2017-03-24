package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarCheckedException2 {
	private static Scanner teclado;

	public static FileWriter abrirFichero(String ruta) throws IOException {
		// try {
		return new FileWriter(ruta);
		// } catch (IOException ioex) {
		// Aquí capturamos cualquier excepción IOException que se lance
		// ioex.printStackTrace();
		// return null;
		// }
	}
	
	public static void main(String[] args) throws IOException {
		teclado = new Scanner(System.in);
		System.out.print("Ruta del fichero donde vas a escribir: ");
		String ruta = teclado.nextLine();
		FileWriter fichero = null;

		//try {
			fichero = abrirFichero(ruta);
			System.out.println("Texto que vas a escribir en el fichero");
			String texto = teclado.nextLine();
			fichero.write(texto);
		//} catch (IOException e1) {
		//	System.out.println("El fichero no ha sido abierto");
		//}
		//try {
			fichero.close();
		//} catch (IOException e) {
		//	e.printStackTrace();
		//} catch (NullPointerException e) {
		//	System.out.println("El fichero no ha sido cerrado");
		//}
	}
}
