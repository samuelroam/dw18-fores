package primero;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Scanner key = new Scanner(System.in);
		System.out.println("introduce un numero");

		int option=scan.nextInt();
		

		switch(option) {
		case 1:
			System.out.println("introduce un nombre");
			String nombre=key.nextLine();
			for (int i=0;i<=nombre.length();i++) {
				System.out.println(nombre.substring(0, i));
			}
			break;
		case 2:
			String nombre2="samuel";
			for (int i=0;i<nombre2.length();i++) {
				System.out.print(nombre2.charAt(i)+" ");
			}
			break;
		case 3:
			String nombre3="Samuel";
			int longitud=nombre3.length()-1;
			for (int i=longitud;i>=0;i=i-1) {
				System.out.print(nombre3.charAt(i));
			}
			break;
		case 4:
			String nombre4="samuel";
			for (int i=0;i<nombre4.length();i++) {
				if(i==0) {
					System.out.print(nombre4.toUpperCase().charAt(i));
				}else {
					System.out.print(nombre4.charAt(i));
				}
			}
			break;
		case 5:
			System.out.println("introduce un nombre");
			String nombre5=key.nextLine();
			nombre5=nombre5.toLowerCase();
			String nombr="samuel";
			
			while(!nombre5.equalsIgnoreCase(nombr)) {
				System.out.println("introduce el nombre correcto");
				nombre5=key.nextLine();
			}
			System.out.println("buenos dias");
			break;
		
			
		}
	}

}
