package primero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero {

	public static void main(String[] args) {
		// investigar como leer y escribir en fichero

		try {
			File f = new File("fichero1.txt");
			Scanner s = new Scanner(f);
			while (s.hasNextLine()) {
				String line = s.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Ell archivo no existe");

		}
	}

}
