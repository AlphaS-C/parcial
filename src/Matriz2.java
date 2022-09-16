
public class Matriz2 {
// punto 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz = new int[][]{{10,2,3,4,5}, {6,7,8,9,0}, {15,25,3,4,5}};
		int [][] matrizCopia = new int[matriz[0].length][matriz.length];
		
		imprimirMatriz(transponerMatriz(matriz, matrizCopia, 0, 0));
		
		
	}

	
	public static int[][] transponerMatriz(int[][] matriz, int[][]copia ,int i, int j) {
		
		int filas = matriz.length;
		int columnas = matriz[i].length;
		
		if (j >= columnas){
			j = 0;
			i++;
		}
		
		if(i >= filas) {
			return copia;
		}
		
        	copia[j][i] = matriz[i][j];
 
        return transponerMatriz(matriz,copia,i,j+1);
	}
	
	
	public static void imprimirMatriz (int [][] matriz) {
		
		for (int i= 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
