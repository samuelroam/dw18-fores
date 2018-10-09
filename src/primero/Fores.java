package primero;

import java.util.Scanner;

public class Fores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1..........Numeros del 1 al 15");
		System.out.println("2..........Numeros del 20 al 2");
		System.out.println("3..........Tabla del 5");
		System.out.println("4..........Multiplos de 6 rango 1-100");
		System.out.println("5..........Multiplos de 3 y 7 entre rango introducido");
		System.out.println("6..........Rectángulo");
		System.out.println("7..........Rectángulo hueco");
		System.out.println("8..........Crea un programa que pida al usuario un número entero largo y muestre cuáles son sus divisores (aquellos entre los que se puede dividir, obteniendo como resto 0)");
		System.out.println("9..........Crea un programa que pida al usuario un número entero largo y diga si es primo (si sólo es divisible entre 1 y él mismo)");
		System.out.println("10.........Crea un programa que pida al usuario dos números enteros largos y diga cuántos números primos hay entre ellos (ambos incluidos)");




		
		Scanner scan = new Scanner(System.in);
		int opcion = scan.nextInt();
		
		
		
		switch(opcion) {
		case 1:
			for(int i=1;i<=15;i++) {
				System.out.println(i);
			
			}
			break;
		case 2:
			for(int i=20;i>=2;i-=2) {
				System.out.println(i);
			}
			break;
		case 3:
			for(int i=1;i<=10;i++) {
				int prod;
				prod=5*i;
				System.out.println("5 * "+i+" = "+prod);
			}
			break;
		case 4:
			for (int i=0;i<=100;i++) {
				if(i%6==0) {
					System.out.println(i);
				}
			}
			break;
		case 5:
			System.out.println("introduce un numero");
			int usub = scan.nextInt();
			for (int i=1;i<=usub;i++) {
				if(i%3==0 && i%7==0) {
					System.out.println(i);
				}
			}
			break;
		case 6:
			System.out.println("escribe un numero");
			int usubo=scan.nextInt();
			System.out.println("escribe otro numero");
			int usuboc=scan.nextInt();
			for (int i=1;i<=usubo;i++) {
				for (int j=1;j<=usuboc;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 7:
			System.out.println("escribe un numero");
			int usubb=scan.nextInt();
			for (int a=1;a<=usubb;a++) {
				System.out.print("*");
			}
			System.out.println();
			int usu=usubb-2;
			for (int i=1;i<=usu;i++) {
				System.out.print("*");
				for (int j=1;j<=usu;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
			for (int b=1;b<=usubb;b++) {
				System.out.print("*");
			}
			System.out.println();
			break;
		case 8:
			System.out.println("introduce un numero");
			int max=scan.nextInt();
			for (int i=1;i<=max;i++) {
				if(max%i==0) {
					System.out.println(i);
				}
			}
			break;
		case 9:
			int cont=0;
			System.out.println("introduce un numero");
			int prim=scan.nextInt();
			for (int i=1;i<=prim;i++) {
				if (prim%i==0) {
					cont++;
				}
			}
			if (cont <=2){
				System.out.println("es primo");
			}else {
				System.out.println("no es primo");
			}
			break;
		case 10:
			System.out.println("coming soon");
			int contb=0;
			int contc=0;
			System.out.println("introduce un numero");
			int prima=scan.nextInt();
			System.out.println("introduce otro numero");
			int primb=scan.nextInt();
			for (int i=1;i<=prima;i++) {
				if (prima%i==0) {
					contb++;
				}
			}
			for (int j=1;j<=primb;j++) {
				if (primb%j==0) {
					contc++;
				}
			}
			System.out.println(contb+" "+contc);
			break;
		}
	}

}
