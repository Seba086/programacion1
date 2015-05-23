import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio2 {
	// Implementar un método que busque la posición de un valor entero dado en
	// un arreglo ordenado.
	@Test
	public void buscarEnArrOrdenado() {
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int valor = 5;
		assertTrue(exists(arr,valor));
		assertFalse(exists(arr,20));
	}

	public boolean exists(int arr[], int buscado) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == buscado) {
				return true;
			}
		}
		return false;
	}
}
