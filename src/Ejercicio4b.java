public class Ejercicio4b {
	// Implementar un método que realice un corrimiento a izquierda en un arreglo
	// ordenado a partir de una posición.
	public static void main (String args[]) {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int pos = 6;
		correrAIzquierda(arr, pos);
		imprimirArreglo(arr);

	}

	private static void imprimirArreglo(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i]+", ");
			i++;
		}
		System.out.println();

	}

	private static void correrAIzquierda(int[] arr, int pos) {
		for (int i = 0; i<pos; i++) {
			arr[i] = arr[i+1];
		}

	}
	
	//este no anda: 6, 6, 6, 6, 6, 6, 6, 7, 8, 9
	private static void correrAIzquierda2(int[] arr, int pos) {
		for (int i = pos; i > 0; i--) {
			arr[i-1] = arr[i];
		}
	}

}
