package primero;

import java.util.Scanner;

public class Swich {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int caso = scan.nextInt();
		
		switch(caso) {
		
		case 1:
			System.out.println("este mes es enero");
			break;
		case 2:
			System.out.println("este mes es febrero");
			break;
		case 3:
			System.out.println("este mes es marzo");
			break;
		case 4:
			System.out.println("este mes es abril");
			break;
		case 5:
			System.out.println("este mes es mayo");
			break;
		case 6:
			System.out.println("este mes es junio");
			break;
		case 7:
			System.out.println("este mes es julio");
			break;
		case 8:
			System.out.println("este mes es agosto");
			break;
		case 9:
			System.out.println("este mes es septiembre");
			break;
		case 10:
			System.out.println("este mes es octubre");
			break;
		case 11:
			System.out.println("este mes es noviembre");
			break;
		case 12:
			System.out.println("este mes es diciembre");
			break;
		
		}
	}

}
