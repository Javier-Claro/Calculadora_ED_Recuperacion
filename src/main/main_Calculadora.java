package main;

import java.util.Scanner;

public class main_Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 1;
		
		do {
		System.out.println("1 ---> Suma");
		System.out.println("2 ---> Resta");
		System.out.println("3 ---> Multiplicación");
		System.out.println("4 ---> División");
		System.out.println("5 ---> Resto");
		System.out.println("6 ---> Exponente");
		System.out.println("0 ---> Salir");
		
		System.out.print("\nSeleccione una opción: ");
		opcion = sc.nextInt();
		
		if (opcion < 0 || opcion > 6)
			System.err.println("\n**ERROR** La opción seleccionada no coincide con ninguna de las mencionadas.\n");
		}while (opcion != 0);
		
		System.out.println("\nFIN DEL PROGRAMA.");
		
		sc.close();
	}

}
