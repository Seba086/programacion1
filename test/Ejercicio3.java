import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio3 {
	// Implementar un método que realice un corrimiento a derecha en un arreglo
	// ordenado a partir de una posición.
	@Test
	public void corrimientoADerechaArrOrdenadoTest() {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int pos = 6;
		correrADerecha(arr, pos);
		int esperado[]= {0,1,2,3,4,5,6,6,7,8};
		assertArrayEquals(esperado, arr);

		int nuevoEsperado[] = {0,0,1,2,3,4,5,6,6,7};
		correrADerecha(arr, 0);
		assertArrayEquals(nuevoEsperado, arr);
		imprimirArreglo(arr);
	}

	private void imprimirArreglo(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}

	}

	private void correrADerecha(int[] arr, int pos) {
		for (int i = arr.length-1; i>pos; i--) {
			arr[i] = arr[i-1];
		}

	}

}
