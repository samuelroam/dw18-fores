package primero;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner letras = new Scanner(System.in);
		for (;;) {
		System.out.println("introduce una opcion");
		System.out.println("1...borrar pantalla");
		System.out.println("2...Dibujar cuadrado 3x3");
		System.out.println("PARAMETROS");
		System.out.println("3...dibujar cuadrado de lado dado");
		System.out.println("4...dibujar un rectangulo");
		System.out.println("5...calcular el numero menor");
		System.out.println("6...primera letra");
		System.out.println();
		System.out.println("0...salir");
		int opcion = scan.nextInt();

		int lado = 0;
		int base = 0;
		int altura = 0;

		switch (opcion) {

		case 1:
			System.out.println("amos a probar");
			borrarPantalla();
			break;
		case 2:
			dibujarCuadrado3x3();
			break;
		case 3:
			System.out.println("introduce un valor para el lado del cuadrado");
			lado = scan.nextInt();
			dibujarCuadrado(lado);
			break;
		case 4:
			System.out.print("introduce un valor para la base: ");
			base = scan.nextInt();
			System.out.print("introduce un valor para la altura: ");
			altura = scan.nextInt();
			dibujarCuadrado(base, altura);
			break;
		case 5:
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			
			System.out.println(numeroMenor(num1,num2));
			break;
		case 6:
			String calc = letras.nextLine();
			System.out.println(primeraLetra(calc));
			break;
		case 7:
			String calc2 = letras.nextLine();
			System.out.println(ultimaLetra(calc2));
			break;
			
		case 0:
			System.exit(0);
			break;

		}
		}
	}

	public static void borrarPantalla() {
		for (int i = 0; i < 15; i++) {

			System.out.println();
		}

	}

	public static void dibujarCuadrado3x3() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void dibujarCuadrado(int lado) {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void dibujarCuadrado(int base, int altura) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static int numeroMenor(int num1, int num2) {
		int menor=0;
		if (num1<num2) {
			menor=num1;
			
		}else if(num2<num1) {
			menor=num2;
			
		}
		return menor;
	}
	
	public static char primeraLetra(String calc) {
		char primera=calc.charAt(0);
		return primera;
	}
	
	public static char ultimaLetra(String calc2) {
		char ultima=0;
		for (int i=0;i<calc2.length();i++) {
			ultima=calc2.charAt(i);
		}
		return ultima;
	}

}
