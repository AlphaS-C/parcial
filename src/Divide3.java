
public class Divide3 {
// punto 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arreglo = new int[]{1,2,3,4,5};
		
		System.out.println(calcularProducto(arreglo, 0, arreglo.length-1, 2));
	}

	
	public static int calcularProducto(int[] arreglo, int inicio, int fin, int b) {
		if(inicio == fin) {
			if(arreglo[fin] > b) return arreglo[fin];
			return 1;
		}
		
		int mitad = (inicio+fin)/2;
		return calcularProducto(arreglo, inicio, mitad, b)*calcularProducto(arreglo, mitad+1, fin, b);
		
	}
	
	
	
}
