package Capitulo03.bloque04;

import java.util.Scanner;

public class Ejercicio03_buclesconwhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, i;
		boolean tabla = true;
		System.out.println("Dame la tabla de multiplicar que quieres: ");
		num = sc.nextInt();
		
		System.out.println("Tabla de multiplicar de: " + num);
		
		i = 1;
		
		while (1 < num) {
			
			if (i <= 15) {
				tabla = false;
			}
			i++;
		}
		if (tabla == true) {
			 System.out.println(num + "x"+ i + "==" + (num*i));
				
		}
     
	}

}














































































