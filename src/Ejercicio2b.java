public class Ejercicio2b {
	// Implementar un método que busque la posición de un valor entero dado en
	// un arreglo ordenado.
	public static void main(String args[]) {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int valor = 5;
		System.out.println(exists(arr,valor));
		System.out.println(exists(arr,20));
	}

	public static boolean exists(int arr[], int buscado) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == buscado) {
				return true;
			}
		}
		return false;
	}
}
