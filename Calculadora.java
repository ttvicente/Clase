package estructurasdecontrol;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		int primerNumero = 0;
		int segundoNumero = 0;
		int opcion = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		primerNumero = scanner.nextInt();

		System.out.println("Introduce el segundo numero");
		segundoNumero = scanner.nextInt();

		System.out.println("¿Que deseas hacer?\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division");
		opcion = scanner.nextInt();
//Hacemos el menu mediante un switch
		switch (opcion) {
		case 1:
			System.out.println("\nEl resultado de la suma es: " + (primerNumero + segundoNumero));
			break;
		case 2:
			System.out.println("\nEl resultado de la resta es: " + (primerNumero - segundoNumero));
			break;
		case 3:
			System.out.println("\nEl resultado de la multiplicacion es: " + (primerNumero * segundoNumero));
			break;
		case 4:
			if (segundoNumero == 0) {
				System.out.println("\nNo se puede dividir por 0");
			} else {
				System.out.println("El resultado de la division es: " + (primerNumero / segundoNumero));
			}
			break;
		default:
			System.out.println("Funcion no valida");
		}

	}
}