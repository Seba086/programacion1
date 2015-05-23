import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio8 {

	// Hacer un programa que devuelva la posición de inicio y fin de la
	// primer secuencia de números distinta de ceros.
	@Test
	public void posInicioFinTest() {
		int arr[] = {0, 0,11,12,0,1,2,3,0,0,0};
		int esperadoInicio= 2;
		int esperadoFin=3;
		int inicio= obtenerPosInicio(arr);
		int fin=obtenerPosFin(inicio,arr);
		assertEquals(esperadoInicio, inicio);
		assertEquals(esperadoFin, fin);
		System.out.println("inicio: "+inicio);
		System.out.println("fin: "+fin);
	}

	private int obtenerPosFin(int inicio, int[] arr) {
		int pos=inicio;
		while(arr[pos] !=0 ){
			pos++;
		}
		return pos-1;
	}

	private int obtenerPosInicio(int[] arr) {
		int pos=0; 
		while (arr[pos] == 0){
			pos++;
			
		}
		return pos;
	}
}
