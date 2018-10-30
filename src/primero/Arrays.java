package primero;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (;;) {

			System.out.println("introduce una opcion");
			System.out.println("1...Calcular el promedio");
			System.out.println("2...Calcular maximo y minimo");
			System.out.println("3,4,10,11,");
			int option = scan.nextInt();

			switch (option) {
			case 1:
				int[] calculo = new int[4];
				double suma = 0;
				for (int i = 0; i < 4; i++) {
					System.out.print("introduce el numero de la posición " + i + " ");
					calculo[i] = scan.nextInt();
					suma = calculo[i] + suma;
					System.out.print("\n");
				}
				double promedio = suma / 4;
				System.out.println(promedio);
				break;
				
			default:
				scan.close();
				System.exit(0);
				break;
			}
		}

	}

}
