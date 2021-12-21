package Capitulo05_arrays.bloque05;

public class Ejercicio01_arraysMatrices {

	public static void main(String[] args) {

	int matriz [][] = new int[][] {{1,0,0},
								   {0,2,0},
								   {0,0,3}};
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
							
		}
	}
	System.out.println("Matriz es triangular: " + esMatrizTriangular(matriz));
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

}
