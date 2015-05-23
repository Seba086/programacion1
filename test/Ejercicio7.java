import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio7 {
	private static final int MAX = 10;

	// Hacer un programa que cargue un arreglo de tamaño MAX=10 con números
	// enteros aleatorios entre 0 y 100 de tal manera que quede ordenado
	// decrecientemente. Finalmente imprima el arreglo.
	@Test
	public void arregloOrdenarTest() {
		int arr[] = create();
		int arr2[] = { 1, 10, 57, 5, 3, 4, 7, 8, 2, 11 };
		int esperado[] = {57,11,10,8,7,5,4,3,2,1};
		ordenarBurbuja(arr2);
		assertArrayEquals(esperado, arr2);
		imprimirArreglo(arr2);
	}

	private static void imprimirArreglo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

	private void ordenarBurbuja(int[] arr) {
		// 1,2,3,4,5,7,8,10,11,57
		int temp = 0;
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i+1]) {
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	private int[] create() {
		int arr[] = new int[MAX];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.println(arr[i]);
		}
		return arr;
	}
}
