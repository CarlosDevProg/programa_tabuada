package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int num = 0, resultado, i;
		
		System.out.println("----------Programa para calcular tabuada!!!---------");
		
		try {
	    	System.out.print("Digite um número para calcular a tabuada: ");
		    num = sc.nextInt();
		
		   for(i=1; i<=10; i++) {
			  resultado = num * i;
			    System.out.printf("%d X %d = %d%n", num, i, resultado);    
			}
		           System.out.println();
		           System.out.println("----------Fim do Programa!---------");
		}
		catch(InputMismatchException err) {
				System.out.println("Digite apenas números inteiros!");
		        System.out.println("----------Fim do Programa!---------");
		}
		
		sc.close();
	}
}