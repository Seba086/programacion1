import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio6 {
	// Hacer un programa que elimine un elemento en un arreglo (ordenado
	// decrecientemente) de tamaño MAX=10. Finalmente se pide que imprima el
	// arreglo.
	@Test
	public void test() {
		int arr[]={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int pos = 2;
		int esperado[]={10, 9, 7, 6, 5, 4, 3, 2, 1, 1};
		borrar(arr,pos);
		assertArrayEquals(esperado, arr);
		imprimirArreglo(arr);
	}

	private void borrar(int[] arr, int pos) {
		correrAIzquierda(arr, pos);
		
	}
	private static void correrAIzquierda(int[] arr, int pos) {
		for (int i = pos; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}

	}
	private static void imprimirArreglo(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}

}
