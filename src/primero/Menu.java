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
		System.out.println("3...Invertir numero");
		System.out.println("4...Coming Soon");
		System.out.println("5...Triangulo");
		System.out.println("6...Binario a decimal");
		System.out.println("7...Contar vocales");
		System.out.println("8...Salir");
		int option = scan.nextInt();
		
		switch(option) {
		
		case 1:
			int numdig;
			
			do {
			System.out.println("Introduce uno positivo");
			numdig = scan.nextInt();
			}while(numdig<0);
			
			String dignum =String.valueOf(numdig);
			System.out.println();
			System.out.println("El numero tiene "+dignum.length()+" digitos");
			System.out.println();
			System.out.println();
			break;
			
		case 2:
			int numydig;
			int dig;
			do {
			System.out.println("Introduce uno positivo");
			numydig = scan.nextInt();
			}while(numydig<0);
			
			do {
			System.out.println("introduce un digito");
			dig = scan.nextInt();
			}while(dig<0);
			
			String digynum = String.valueOf(numydig);
			String digi = String.valueOf(dig);
			char digit = digi.charAt(0);
			int contador=0;
			for (int i=0;i<digynum.length();i++) {
				if (digynum.charAt(i)==digit) {
					contador++;
				}
			}
			System.out.println();
			System.out.println("El digito "+dig+" aparece "+contador+" veces");
			System.out.println();
			System.out.println();
			break;
			
		case 3:
			int numinv;
			do {
			System.out.println("Introduce un numero");
			numinv=scan.nextInt();
			}while(numinv<0);
			
			String invnum=String.valueOf(numinv);
			StringBuilder numinver=new StringBuilder(invnum);
			System.out.println(numinver.reverse());
			break;
			
		case 4:
			int numfac;
			
			do {
			System.out.println("Introduce un numero");
			numfac=scan.nextInt();
			}while(numfac<0);
			while (numfac<1) {
				long facto=1L;
			for (int i=numfac;i>0;i--) {
				facto=facto*i;
			}
			
			System.out.println(numfac+" "+facto);
			}
			break;
			
		case 5:
			int numtri;
			do {
			System.out.println("Introduce un numero");
			numtri=scan.nextInt();
			}while(numtri<0);
			int count=0;
			int j;
			for (int i=0;i<numtri;i++) {
				for (j=0;j<count;j++) {
					System.out.print("*");
				}
				System.out.println();
				count++;
			}
			for (int k=numtri;k>0;k=k-1) {
				for (int l=count;l>0;l=l-1) {
					System.out.print("*");
				}
				System.out.println();
				count=count-1;
			}
			break;
			
		case 6:
			long numero, aux, digito, decimal;
			int exponente;
			boolean esBinario;
			
			do {
			System.out.println("Introduce un numero binario");
			numero=scan.nextLong();
			esBinario=true;
			aux=numero;
			while (aux!=0) {
				digito=aux%10;
				if(digito!=0 && digito !=1) {
					esBinario=false;
				}
				aux=aux/10;
			}
			}while (!esBinario);
			exponente=0;
			decimal=0;
			while (numero!=0) {
				digito=numero%10;
				decimal=decimal+digito*(int)Math.pow(2, exponente);
				exponente++;
				numero=numero/10;
			}
			System.out.println();
			System.out.println("El numero introducido en binario es "+decimal+" en decimal");
			System.out.println();
			break;
			// http://puntocomnoesunlenguaje.blogspot.com/2014/11/pasar-de-binario-decimal-en-java.html
			
		case 7:
			System.out.println("Introduce una frase");
			String frase;
			frase=scan.nextLine();
			int cont =0;
			for (int i=0;i<frase.length();i++) {
				if(frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u') {
					cont++;
				}
			}
			System.out.println("En el texto introducido aparecen "+cont+" vocales");
			break;
			
		case 8:
			System.exit(0);
			break;
		default:
			break;
		}
	}
	}

}
