package com.cip.prog5;

import java.util.Scanner;

public class EjercicioEntregar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor=(int) (Math.random()*100);
				
		Scanner sc= new Scanner(System.in);
		
		int numero=0;
				
		int intentos=0;
		
		while(numero!=valor) {
			
			intentos++;
			
			System.out.println("Introduce un número, por favor ");
			
		        numero=sc.nextInt();
		    
		        if(valor<numero) {
			
			    System.out.println("Es un número mas bajo");
	
		    }
		
		        else if(valor>numero) {
			
			    System.out.println("Es un número mas alto");
		    }
		    
		}
		System.out.println("Es correcto. Lo has conseguido en " + intentos + " intentos");	
		
		sc.close();
		
			
	}

}
