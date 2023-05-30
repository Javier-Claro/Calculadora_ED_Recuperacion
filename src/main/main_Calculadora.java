package main;

import java.util.Scanner;

import calculadora.suma;
import calculadora.resta;
import calculadora.division;
import calculadora.multiplicacion;
import calculadora.resto;
import calculadora.exponente;

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
		
		else {
			System.out.print("Indique el primer número del cálculo: ");
			int num1 = sc.nextInt();
			System.out.print("Indique el segundo número del cálculo: ");
			int num2 = sc.nextInt();
			
		switch (opcion) {
		
		case 1:
			
			break;
			
		case 2:
					
			break;
			
		case 3:
			
			break;
			
		case 4:
			
			break;
			
		case 5:
			
			break;
			
		case 6:
			
			break;
			}
		}
		}while (opcion != 0);
		
		System.out.println("\nFIN DEL PROGRAMA.");
		
		sc.close();
	}
}