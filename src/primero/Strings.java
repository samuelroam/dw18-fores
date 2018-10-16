package primero;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int option=scan.nextInt();
		
		System.out.println("introduce un numero");

		switch(option) {
		case 1:
			String nombre="samuel";
			for (int i=0;i<=nombre.length();i++) {
				System.out.println(nombre.substring(0, i));
			}
			break;
		}
	}

}
