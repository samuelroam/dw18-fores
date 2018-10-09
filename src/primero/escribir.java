package primero;

import java.util.Scanner;

public class escribir {

	public static void main(String[] args) {

		/*Scanner scan = new Scanner(System.in);
		System.out.println("introduce el primer numero");
		int primerNumero = scan.nextInt();
		System.out.println("introduce el segundo numero");
		int segundoNumero = scan.nextInt();
		
		System.out.println("La suma de "+primerNumero+" y "+segundoNumero+" es:");
		System.out.println(primerNumero+segundoNumero);
		
		System.out.println("La resta de "+primerNumero+" y "+segundoNumero+" es:");
		System.out.println(primerNumero-segundoNumero);
		
		System.out.println("La multiplicacion de "+primerNumero+" y "+segundoNumero+" es:");
		System.out.println(primerNumero*segundoNumero);
		
		System.out.println("La division de "+primerNumero+" y "+segundoNumero+" es:");
		System.out.println(primerNumero/segundoNumero);
		
		System.out.println("El mod de "+primerNumero+" y "+segundoNumero+" es:");
		System.out.println(primerNumero%segundoNumero);*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Elige una opcion");
		System.out.println("1............................calculo de metros a partir de millas");
		System.out.println("2..........calculo de grados Farenhait a partir de grados Celsius");
		System.out.println("3............Calculo del area del triangulo a partir de sus lados");
		int opcion = scan.nextInt();
		switch(opcion) {
		
		case 1:
			Scanner lMilla = new Scanner(System.in);
			System.out.println("introduce una cantidad en millas");
			int milla = lMilla.nextInt();
			int metros;
			metros = milla*1609;
			System.out.println(metros);
			break;
			
		case 2:
			Scanner lGrados = new Scanner(System.in);
			System.out.println("introduce una cantidad en grados C");
			int celsius = lGrados.nextInt();
			float faren =(float) ((9*celsius)/5)+32;
			System.out.println(faren);
			break;
			
		case 3:
			Scanner lLado = new Scanner(System.in);
			System.out.println("introduce la base");
			int base = lLado.nextInt();
			System.out.println("introduce la altura");
			int altura = lLado.nextInt();
			float superficie =(float) (base*altura)/2;
			System.out.println(superficie);
			break;
			
		
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
