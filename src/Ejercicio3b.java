

public class Ejercicio3b {
	// Implementar un método que realice un corrimiento a derecha en un arreglo
	// ordenado a partir de una posición.
	public static void main(String args[]) {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int pos = 6;
		correrADerecha(arr, pos);
		imprimirArreglo(arr);
	}

	private static void imprimirArreglo(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
	}

	private static void correrADerecha(int[] arr, int pos) {
		for (int i = arr.length-1; i>pos; i--) {
			arr[i] = arr[i-1];
		}
	}
}
