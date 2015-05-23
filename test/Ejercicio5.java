import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio5 {
	// Hacer un programa que inserte un elemento en un arreglo (ordenado
	// decrecientemente) de tamaño MAX=10. Corriendo los elementos a la derecha.
	// Finalmente se pide que imprima el arreglo.

	@Test
	public void insertarElementoTest() {
		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int pos = 2;
		int valor = 100;
		insertar(arr, pos, valor);
		int esperado[] = { 10, 9, 100, 8, 7, 6, 5, 4, 3, 2 };
		assertArrayEquals(esperado, arr);
		imprimirArreglo(arr);
	}

	private void insertar(int[] arr, int pos, int valor) {
		correrADerecha(arr,pos);
		arr[pos]=valor;
	}
	
	private void correrADerecha(int[] arr, int pos) {
		for (int i = arr.length-1; i>pos; i--) {
			arr[i] = arr[i-1];
		}
	}

	private static void imprimirArreglo(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
}
