package Capitulo05_arrays.bloque05;

import java.util.Scanner;

public class Ejercicio01_arraysMatrices {

	public static void main(String[] args) {
	int o = 0;
	int array[] = new int [] {};
	int matriz [][] = new int[][] {{1,0,0},
								   {0,2,0},
								   {0,0,3}};
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
							
		}
	}
	
	/**
	 *  MOSTRAR EN PANTALLA 
	 */
	esMatrizTriangular(matriz);
	System.out.println(MatrizEsDiagonal(matriz));
	TransformarMatriz(matriz, o, array);
	System.out.println("La simetria de la matriz es: " + haysimetria(matriz));
	matrizcontraria(matriz);
	Eliminarnum(o, o, matriz);
	
	}
	
	/**
	 * 				
	 * @param Es Matriz Triangular
	 * @return
	 */
	public static boolean esMatrizTriangular (int matriz[][]) {
		
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
		
		if(matriz[i = 0][j = 1] != 0 && matriz [i = 0][j = 2] != 0 ) {
		return false;
		}
			
		}
		}
	return true;
	}
	
	/**
	 * Es Matriz Diagonal
	 * @param matriz
	 * @return
	 */
	public static boolean MatrizEsDiagonal( int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j < i && matriz[i][j] != 0) {
					return true;
				}
				
			}
		}
		return true;
	}
	
	
	/**
	 * Transformación de la Matriz
	 * @param 
	 */
	
	public static void TransformarMatriz (int matriz[][], int o, int array[]) {
		o = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[o]= matriz[i][j];
				System.out.print(array[o]);
				o++;
			}
		}
		System.out.println();
	}
	
	/**
	 * Es simetrica matriz
	 * @param matriz
	 * @return
	 */
	public static boolean haysimetria (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != matriz [j][i]) {
					return false;
				}
			}
		}
		 return true;
		
	}
	
	/**
	 * La matriz contraria
	 * @param matriz
	 */
	
	public static void matrizcontraria (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]= -(matriz[i][j]);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		}
		
	
	/**
	 * Eliminar num de raiz
	 * @param fila
	 * @param colum
	 * @param matriz
	 */
	public static void Eliminarnum (int fila, int colum, int matriz[][]) {
		Scanner sc = new Scanner (System.in);	
		System.out.println("Elija la fila :");
		fila = sc.nextInt() - 1;
		System.out.println("Elija la columna :");
		colum = sc.nextInt() - 1;
		matriz[fila][colum] = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	
	}

}
