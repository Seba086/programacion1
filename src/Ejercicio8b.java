
public class Ejercicio8b {

	// Hacer un programa que devuelva la posición de inicio y fin de la
	// primer secuencia de números distinta de ceros.
	public static void main (String Arg[]) {
		int arr[] = {0, 0,11,12,0,1,2,3,0,0,0};
		int inicio= obtenerPosInicio(arr);
		int fin=obtenerPosFin(inicio,arr);
		System.out.println("inicio: "+inicio);
		System.out.println("fin: "+fin);
	}

	private static int obtenerPosFin(int inicio, int[] arr) {
		int pos=inicio;
		while(arr[pos] !=0 ){
			pos++;
		}
		return pos-1;
	}

	private static int obtenerPosInicio(int[] arr) {
		int pos=0; 
		while (arr[pos] == 0){
			pos++;
			
		}
		return pos;
	}
}
