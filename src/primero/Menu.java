package primero;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		for (;;) {
		System.out.println("Introduce una opción");
		System.out.println("1...Cuantos digitos tiene un numero?");
		System.out.println("2...El digito aparece en el numero?");
		System.out.println("3...Coming Soon");
		System.out.println("4...Coming Soon");
		System.out.println("5...Coming Soon");
		System.out.println("6...Coming Soon");
		System.out.println("7...Salir");
		int option = scan.nextInt();
		
		switch(option) {
		case 1:
			int numdig;
			System.out.println("introduce un numero");
			numdig = scan.nextInt();
			do {
			System.out.println("Introduce uno positivo");
			numdig = scan.nextInt();
			}while(numdig<0);
			String dignum =String.valueOf(numdig);
			System.out.println(dignum.length());
			break;
			
		case 2:
			int numydig;
			System.out.println("introduce un numero");
			numydig = scan.nextInt();
			do {
			System.out.println("Introduce uno positivo");
			numydig = scan.nextInt();
			}while(numydig<0);
			System.out.println("introduce un digito");
			int dig = scan.nextInt();
			String digynum = String.valueOf(numydig);
			String digi = String.valueOf(dig);
			char digit = digi.charAt(0);
			int contador=0;
			for (int i=0;i<digynum.length();i++) {
				if (digynum.charAt(i)==digit) {
					contador++;
				}
			}
			System.out.println(contador);
			break;
			
		case 3:
			int numinv;
			System.out.println("Introduce un numero");
			numinv=scan.nextInt();
			String invnum=String.valueOf(numinv);
			StringBuilder numinver=new StringBuilder(invnum);
			System.out.println(numinver);
			break;
		case 4:
			break;
		case 5:
			int numtri;
			System.out.println("Introduce un numero");
			numtri=scan.nextInt();
			int count=0;
			int j;
			for (int i=0;i<numtri;i++) {
				for (j=0;j<count;j++) {
					System.out.print("*");
				}
				System.out.println();
				count++;
			}
			break;
		case 6:
			break;
		case 7:
			System.exit(0);
			break;
		default:
			break;
		}
	}
	}

}
