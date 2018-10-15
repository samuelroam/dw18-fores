package primero;

import java.util.Scanner;

public class Contrasena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int intentos = scan.nextInt();
		int contra;
		for (int i=1; i<=intentos;i++) {
			contra = scan.nextInt();
			if (contra != 1234) {
				System.out.println("vuelve a intentarlo");
			}else {
				System.out.println("contraseña correcta");
				break;
			}
		}
		/*
		 * leer intentos
		 * for (int i=1;i<=intentos;i++){
		 * leer contra;
		 * if(contra!=1234) escribir "vuelve a intentarlo"
		 * else breakM
		 * }
		 */
	}

}
