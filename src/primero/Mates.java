package primero;

import java.util.Scanner;

public class Mates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("introduce una opcion");
		int opcion = scan.nextInt();
		switch(opcion) {
		case 1:
			
		for (int i=0;i<50;i++) {
		int dado1 = (int) (Math.random()*6)+1;
		int dado2 = (int) (Math.random()*6)+1;
		System.out.println("Los dados han salido "+dado1+" y "+dado2+". Un total de "+ (dado1+dado2));
		}
		break;
		case 2:
			int azar=(int)(Math.random()*100)+1;
			int adivina=0;
			System.out.println("introduce un numero");
			for (int i=0;i<7;i++) {
				adivina = scan.nextInt();
				if(adivina<azar) {
					System.out.println("introduce un numero mayor");
				}else if(adivina>azar) {
					System.out.println("introduce un numero menor");
				}else {
					System.out.println("Has acertado");
					break;
				}
			}
			System.out.println("Has agotado los 6 intentos");
			break;
		}
	}

}
