import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio1 {
	// Hacer un programa que cargue un arreglo (sin orden) de tamaño MAX=10
	// con números enteros aleatorios entre 0 y 100.
	// Finalmente imprima el arreglo por pantalla
	private static final int MAX = 10;

	@Test
	public void cargarArregloTest() {
		int arr[] = create();
		assertTrue(arr.length == 10);
	}

	@Test
	public void randomEntre0y100() {
		int[] arr = create();
		for (int i = 0; i < arr.length; i++) {
			assertTrue(arr[i] >= 0 && arr[i] <= 100);
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
